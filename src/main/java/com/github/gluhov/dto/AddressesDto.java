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
public class AddressesDto extends BaseDto{
    private String address;
    private String zipCode;
    private LocalDateTime archivedAt;
    private String city;
    private String state;
    private CountriesDto country;
    private UUID countryId;

    @Builder
    public AddressesDto(UUID id, LocalDateTime created, LocalDateTime updated, String address, String zipCode,
                        LocalDateTime archivedAt, String city, String state, CountriesDto country, UUID countryId) {
        super(id, created, updated);
        this.address = address;
        this.zipCode = zipCode;
        this.archivedAt = archivedAt;
        this.city = city;
        this.state = state;
        this.country = country;
        this.countryId = countryId;
    }
}
