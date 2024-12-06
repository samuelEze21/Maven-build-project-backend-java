package org.africa.semicolon.quidexCurrencyApplication.dtos.responses;

import lombok.Data;

@Data
public class UserLoginResponseDTO {

    private String userId;
    private String accessToken;

    public UserLoginResponseDTO(String userId, String accessToken) {
        this.userId = userId;
        this.accessToken = accessToken;
    }

}


