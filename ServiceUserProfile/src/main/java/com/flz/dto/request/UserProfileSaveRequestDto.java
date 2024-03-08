package com.flz.dto.request;

import lombok.*;

@Builder // bir sınıftan nesne türetmek için
@Data //set get metotlarını otomatik tanımlar
@NoArgsConstructor
@AllArgsConstructor

public class UserProfileSaveRequestDto {

    Long authId;
    String username;
    String email;

}
