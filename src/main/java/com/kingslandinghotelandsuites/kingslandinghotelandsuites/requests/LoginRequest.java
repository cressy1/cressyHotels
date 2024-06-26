package com.kingslandinghotelandsuites.kingslandinghotelandsuites.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank
    private String email;
    private String password;
}
