package com.github.gluhov.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class IndividualsDto {
    private UUID id;
    private UsersDto user;
    private UUID userId;
    private String passportNumber;
    private String phoneNumber;
    private String password;
    private String email;

    @Builder
    public IndividualsDto(UUID id, UsersDto user, UUID userId, String passportNumber, String phoneNumber, String password, String email) {
        this.id = id;
        this.user = user;
        this.userId = userId;
        this.passportNumber = passportNumber;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.email = email;
    }
}
