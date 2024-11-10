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
public class MerchantsDto extends VerifiedDto {
    private String companyName;
    private UUID creatorId;
    private UsersDto creator;
    private String email;
    private String phoneNumber;
    private boolean filled;

    @Builder
    public MerchantsDto(UUID id, LocalDateTime created, LocalDateTime updated, String status, LocalDateTime verifiedAt,
                        LocalDateTime archivedAt, String companyName, UUID creatorId, UsersDto creator, String email, String phoneNumber, boolean filled) {
        super(id, created, updated, status, verifiedAt, archivedAt);
        this.companyName = companyName;
        this.creatorId = creatorId;
        this.creator = creator;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.filled = filled;
    }
}
