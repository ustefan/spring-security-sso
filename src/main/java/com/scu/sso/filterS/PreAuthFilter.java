package com.scu.sso.filters;

import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

import javax.servlet.http.HttpServletRequest;

public class PreAuthFilter extends AbstractPreAuthenticatedProcessingFilter {
  private static final String TOKEN = "token";

  @Override
  protected Object getPreAuthenticatedPrincipal(HttpServletRequest httpServletRequest) {
    String token = httpServletRequest.getParameter(TOKEN);

    return token;
  }

  @Override
  protected Object getPreAuthenticatedCredentials(HttpServletRequest httpServletRequest) {

    return "";
  }
}
