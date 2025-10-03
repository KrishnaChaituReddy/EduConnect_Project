package com.wecp.progressive.dto;

public class LoginResponse {
   private String token;
   private String roles;
   private Integer userId;
   private Integer referenceId;
   public String getToken() {
      return token;
   }
   public void setToken(String token) {
      this.token = token;
   }
   public String getRoles() {
      return roles;
   }
   public void setRoles(String roles) {
      this.roles = roles;
   }
   public Integer getUserId() {
      return userId;
   }
   public void setUserId(Integer userId) {
      this.userId = userId;
   }
   public Integer getReferenceId() {
      return referenceId;
   }
   public void setReferenceId(Integer referenceId) {
      this.referenceId = referenceId;
   }
   public LoginResponse(String token, String roles, Integer userId, Integer referenceId) {
      this.token = token;
      this.roles = roles;
      this.userId = userId;
      this.referenceId = referenceId;
   }
   public LoginResponse() {
   }



   
}
