package com.shankulk.envvar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

  @Autowired private RestTemplate restTemplate;

  @GetMapping(value = "/welcome")
  public void welcome() {
    byte[] forObject =
        restTemplate.getForObject(
            "https://app-uk.dev.babylontech.co.uk/internal/v1/appointments/394422/pdf",
            byte[].class);

    System.out.println(forObject);

    Consultant consultant =
        restTemplate.getForObject(
            "https://app-uk.dev.babylontech.co.uk/user_profiles/v1/consultants/%s?fields=name,email",
            Consultant.class);

    System.out.println("full name:" + consultant.getFullName());
  }
}
