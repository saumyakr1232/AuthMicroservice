package com.cts.authmicroservice.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class AuthenticationRequestDTO {
    private String username;
    private String password;
}
