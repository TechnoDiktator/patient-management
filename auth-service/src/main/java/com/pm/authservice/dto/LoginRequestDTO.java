package com.pm.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequestDTO {

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be a valid email address0")
    private String wmail;


    @NotBlank(message = "Password is required")
    @Size(min = 8 , message  = "Password must be at least 8 characters long")
    private String password;


    public String getWmail() {
        return wmail;
    }

    public void setWmail(String wmail) {
        this.wmail = wmail;
    }

    public String getPassword() {
        return password;
    }

    public void setMessage(String message) {
        this.password = password;
    }
}
