package org.africa.semicolon.quidexCurrencyApplication.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UpdateUserResponseDTO {
    private String id;
    private String username;
    private String email;
    private String message;
}


















//public class UpdateUserResponseDTO {
//
//    private String userId;
//    private String statusMessage;
//
//    public UpdateUserResponseDTO(String userId, String statusMessage) {
//        this.userId = userId;
//        this.statusMessage = statusMessage;



//    public UpdateUserResponseDTO(String id, String username, String email, String message) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.message = message;
