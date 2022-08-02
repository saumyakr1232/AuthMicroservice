package com.cts.authmicroservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ValidatingDTO {
    @Id
    @JsonProperty
    private boolean validStatus;

}