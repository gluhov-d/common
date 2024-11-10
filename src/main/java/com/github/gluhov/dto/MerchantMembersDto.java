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
public class MerchantMembersDto {
    private UUID id;
    private UUID userId;
    private UsersDto user;
    private UUID merchantId;
    private MerchantsDto merchant;
    private String memberRole;

    @Builder

    public MerchantMembersDto(UUID id, UUID userId, UsersDto user, UUID merchantId, MerchantsDto merchant, String memberRole) {
        this.id = id;
        this.userId = userId;
        this.user = user;
        this.merchantId = merchantId;
        this.merchant = merchant;
        this.memberRole = memberRole;
    }
}
