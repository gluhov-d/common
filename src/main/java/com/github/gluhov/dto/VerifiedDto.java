package com.github.gluhov.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public abstract class VerifiedDto extends StatusesDto {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime verifiedAt;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime archivedAt;

    public VerifiedDto(UUID id, LocalDateTime created, LocalDateTime updated, String status,
                       LocalDateTime verifiedAt, LocalDateTime archivedAt) {
        super(id, created, updated, status);
        this.verifiedAt = verifiedAt;
        this.archivedAt = archivedAt;
    }
}
