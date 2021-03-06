package com.shankulk.envvar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EnvvarDemoApplication {

  private static final String TOKEN =
      "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6Ik9USkNRVUk1TURnMk9VSXdSVFZFTUVGQlEwWkJNak5EUWpOR1FqZzRNVVJGTlRaQlF6WkdRdyJ9.eyJodHRwczovL2JhYnlsb25oZWFsdGguY29tL3VzZXIiOiIyOWY5NmZmMC01ZGJmLTRkMjEtOGIwMS1mNjUyZGUzMTA1OTIiLCJodHRwczovL2JhYnlsb25oZWFsdGguY29tL2FsbG93ZWQtcmVnaW9ucyI6ImRldi11ayIsImh0dHBzOi8vYmFieWxvbmhlYWx0aC5jb20vcnVieS10b2tlbiI6IjBiODc0NjE1YjczMDg3Nzk5Nzc3NTA0YTUwYzk3Njk4IiwiaHR0cHM6Ly9iYWJ5bG9uaGVhbHRoLmNvbS9hdXRoei92MSI6ImV5SnliMnhsY3lJNld5SmtaWFpsYkc5d1pYSWlMQ0puYkc5aVlXeGZZV1J0YVc0aVhTd2ljR0Z5ZEc1bGNsOXBaSE1pT2xzaVltRmllV3h2Ymkxb1pXRnNkR2dpTENKdWFITWlMQ0owWlhOMElsMTkiLCJodHRwczovL2JhYnlsb25oZWFsdGguY29tL2F1dGh6L3YyIjoiZXlKeWIyeGxRbWx1WkdsdVozTWlPbHQ3SW5KdmJHVWlPaUprWlhabGJHOXdaWElpTENKd1lYSjBibVZ5Y3lJNld5SmlZV0o1Ykc5dUxXaGxZV3gwYUNJc0ltNW9jeUlzSW5SbGMzUWlYWDBzZXlKeWIyeGxJam9pWjJ4dlltRnNYMkZrYldsdUlpd2ljR0Z5ZEc1bGNuTWlPbHNpWW1GaWVXeHZiaTFvWldGc2RHZ2lMQ0p1YUhNaUxDSjBaWE4wSWwxOVhYMD0iLCJpc3MiOiJodHRwczovL2F1dGguZ2xvYmFsMS5kZXYuYmFieWxvbnRlY2guY28udWsvIiwic3ViIjoiYXV0aDB8c3RhdGljLXVzZXItaWQiLCJhdWQiOiJodHRwczovL2JhYnlsb25oZWFsdGguY29tIiwiaWF0IjoxNjAxNDc0OTI4LCJleHAiOjE2MDE0NzY3MjgsImF6cCI6InhvTmltWUNWeHcxTHBHZW44c0RjclRqMDBpWkUzMlRMIiwic2NvcGUiOiJvZmZsaW5lX2FjY2VzcyIsImd0eSI6InBhc3N3b3JkIn0.UO-6WwrZB7Cas_rqnZfZM55c9DTb7FUNwiY6rJqYUkEMIsg3QTCejLoX6Bxn0AgafaMLCCVHS-S0TNUc7US0cQo-Ghc67iif2avGHE-tM9Y1GFC02X_fDAkj1NC7UQZSYWvNHOKHrCSqtvkMXDlZEwy5utudegLfyXM78xBKPKVmG3DnCQqAixogaunk8p9Z6VMa2yOxVuXkp03P4vtZfWyY8hgY4ScRJTRVd_xSnv3yb3llN8c4e9jD7QbSDlDY5uFLbEUnevnaJMI_2yBWwmsVJsQYe9mlmOWkrEYPS1VIgOA0ILH-lBe_WRGsR0eVT34-26UEO_NZ3nfbuQACgA";

  public static void main(String[] args) {
    SpringApplication.run(EnvvarDemoApplication.class, args);
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplateBuilder().defaultHeader("Authorization", "Bearer " + TOKEN).build();
  }
}
