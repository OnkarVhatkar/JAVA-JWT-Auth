package com.vonkar.jwtauthjpa.dto;

public class JWTResponse {
    private String authToken;

    public JWTResponse(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
