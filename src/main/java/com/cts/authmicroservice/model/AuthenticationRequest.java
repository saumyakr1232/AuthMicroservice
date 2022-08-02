package com.cts.authmicroservice.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@ApiModel(description = "Creating model class for user Authentication")
@Table(name = "Member")
public class AuthenticationRequest {

    @Id
    @Column(name = "username")
    @ApiModelProperty(value = "Username of the Customer doing login")
    private String username;

    @Column(name = "password")
    @ApiModelProperty(value = "Password of the Customer doing login")
    private String password;
}
