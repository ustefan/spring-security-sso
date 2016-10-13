package com.scu.sso.filter;

import javax.servlet.*;
import java.io.IOException;

public class SSOFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println();
    }

    public void destroy() {

    }
}
