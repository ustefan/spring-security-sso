package com.scu.sso.filters;

import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class PreAuthFilter extends AbstractPreAuthenticatedProcessingFilter {
  private static final String TOKEN = "token";

  @Override
  protected Object getPreAuthenticatedPrincipal(HttpServletRequest httpServletRequest) {
    String token = httpServletRequest.getParameter(TOKEN);

    // TODO: Implement custom logic to exchange the token with a username
    Map<String, String> users = new HashMap<>();
    users.put("123", "stef");

    return users.get(token);
  }

  @Override
  protected Object getPreAuthenticatedCredentials(HttpServletRequest httpServletRequest) {

    return "";
  }
}
