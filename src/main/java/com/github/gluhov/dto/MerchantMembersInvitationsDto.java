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
public class MerchantMembersInvitationsDto extends StatusesDto {
    private LocalDateTime expires;
    private MerchantsDto merchant;
    private UUID merchantId;
    private String firstName;
    private String lastName;
    private String email;

    @Builder
    public MerchantMembersInvitationsDto(UUID id, LocalDateTime created, LocalDateTime updated, String status, LocalDateTime expires,
                                         MerchantsDto merchant, UUID merchantId, String firstName, String lastName, String email) {
        super(id, created, updated, status);
        this.expires = expires;
        this.merchant = merchant;
        this.merchantId = merchantId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
