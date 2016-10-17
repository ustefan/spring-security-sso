package com.scu.sso.filters;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter extends OncePerRequestFilter {
  private static final String TOKEN = "token";

  private String loginUrl;

  @Override
  protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                  FilterChain filterChain) throws ServletException, IOException {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String token = httpServletRequest.getParameter(TOKEN);

    if (authentication == null && token == null) {
      httpServletResponse.sendRedirect(loginUrl);
    } else {
      filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
  }

  @Required
  public void setLoginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
  }
}
