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
public class CountriesDto extends StatusesDto{
    private String name;
    private String alpha2;
    private String alpha3;

    @Builder
    public CountriesDto(UUID id, LocalDateTime created, LocalDateTime updated, String status, String name, String alpha2,
                        String alpha3) {
        super(id, created, updated, status);
        this.name = name;
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
    }
}
