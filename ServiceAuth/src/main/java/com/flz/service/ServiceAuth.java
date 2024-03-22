package com.flz.service;

import com.flz.dto.request.DoLoginRequestDto;
import com.flz.dto.request.DoRegisterRequestDto;
import com.flz.dto.response.DoRegisterResponseDto;
import com.flz.manager.IUserProfileManager;
import com.flz.mapper.IAuthMapper;
import com.flz.model.Auth;
import com.flz.rabbitmq.model.AuthSaveModel;
import com.flz.rabbitmq.producer.CreateUserProducer;
import com.flz.repository.IRepositoryAuth;
import com.flz.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceAuth extends ServiceManager<Auth,Long> {

    // *************  @AutoWired *************** //
    private final IRepositoryAuth repository;

    //private final IUserProfileManager userProfileManager;

    private final CreateUserProducer createUserProducer;
    public ServiceAuth(IRepositoryAuth repository, CreateUserProducer createUserProducer) {
        super(repository);
        this.repository = repository;

        this.createUserProducer = createUserProducer;
    }


    // *************** Register *************** //

    public DoRegisterResponseDto doRegister(DoRegisterRequestDto dto) {

        System.out.println("DoRegisterRequestDto: " +  dto);

        // TODO  Exception
        //if (repository.existsByUsername(dto.getUsername()))
        //    throw new Exception()
        /*Auth auth = new Auth();
        auth.setUsername(dto.getUsername());

        // TODO password rePassword
        auth.setPassword(dto.getPassword());
        auth.setEmail(dto.getEmail());
        auth.setCreateAt(System.currentTimeMillis());
        auth.setState(true);
         */
        Auth auth= IAuthMapper.INSTANCE.toAuth(dto);
        save(auth);

        System.out.println("auth: " +  auth);

        // Başka bir servisi çağırıyoruz
        // userProfileManager.save(IAuthMapper.INSTANCE.fromAuth(auth));

        createUserProducer.convertAndSend(AuthSaveModel.builder()
                        .authId(auth.getId())
                        .username(auth.getUsername())
                        .email(auth.getEmail())
                        .build());

        DoRegisterResponseDto responseDto = new DoRegisterResponseDto();
        responseDto.setUsername(dto.getUsername());
        responseDto.setEmail(dto.getEmail());
        return responseDto;
    }


    // ***************** Login ******************** //
    public Auth doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());

        //  if (auth.isEmpty())
        // TODO exception


        return auth.get();
    }

}
