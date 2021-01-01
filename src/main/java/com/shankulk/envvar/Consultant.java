package com.shankulk.envvar;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Consultant {

  @JsonProperty("full_name")
  public String fullName;

  @JsonProperty("email")
  public String email;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
