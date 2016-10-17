package com.scu.sso.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Service used to validate and create user authentication details.
 */
public class PreAuthUserDetailsService implements
                                       AuthenticationUserDetailsService<PreAuthenticatedAuthenticationToken> {
  public UserDetails loadUserDetails(PreAuthenticatedAuthenticationToken token) throws UsernameNotFoundException {
    List<SimpleGrantedAuthority> grantedAuthorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));

    return createUserDetails(token, grantedAuthorities);
  }

  protected UserDetails createUserDetails(Authentication token, Collection<? extends GrantedAuthority> authorities) {

    return new User(token.getName(), "N/A", true, true, true, true, authorities);
  }
}
