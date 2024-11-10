package com.github.gluhov.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UsersDto extends VerifiedDto{
    private String secretKey;
    private String firstName;
    private String lastName;
    private boolean filled;
    private UUID addressId;
    private AddressesDto addresses;

    @Builder
    public UsersDto(UUID id, LocalDateTime created, LocalDateTime updated, String status, LocalDateTime verifiedAt,
                    LocalDateTime archivedAt, String secretKey, String firstName, String lastName, boolean filled, UUID addressId, AddressesDto addresses) {
        super(id, created, updated, status, verifiedAt, archivedAt);
        this.secretKey = secretKey;
        this.firstName = firstName;
        this.lastName = lastName;
        this.filled = filled;
        this.addressId = addressId;
        this.addresses = addresses;
    }
}
