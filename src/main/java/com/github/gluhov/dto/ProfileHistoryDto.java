package com.github.gluhov.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProfileHistoryDto extends BaseDto {
    private UUID profileId;
    private UsersDto user;
    private String profileType;
    private String reason;
    private String comment;
    private Map<String, Object> changedValues;

    @Builder
    public ProfileHistoryDto(UUID id, LocalDateTime created, LocalDateTime updated, UUID profileId, UsersDto user, String profileType, String reason, String comment, Map<String, Object> changedValues) {
        super(id, created, updated);
        this.profileId = profileId;
        this.user = user;
        this.profileType = profileType;
        this.reason = reason;
        this.comment = comment;
        this.changedValues = changedValues;
    }
}
