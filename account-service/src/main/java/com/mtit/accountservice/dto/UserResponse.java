package com.mtit.accountservice.dto;

public class UserResponse {

    private String userId;
    private String message;
    private int status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) { this.userId = userId; }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) { this.message = message; }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) { this.status = status; }

}
