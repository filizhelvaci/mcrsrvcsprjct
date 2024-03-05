package com.flz.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DoRegisterRequestDto {
    //  @Size (min = 3, max = 50)
    private String username;

    //   @Email (message = "Lütfen geçerli mail girin.")
    private String email;

    // private static final String PASSWORD_PATTERN =
    //        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    //  @NotBlank (message = "Şifre boş geçilemez.")
    //@Pattern(regexp = PASSWORD_PATTERN)
    private String password;
    private String rePassword;
}
