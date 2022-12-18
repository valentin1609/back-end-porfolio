
package com.porfolio.va.security;

import com.porfolio.va.entity.UserDetailsServiceImpl;
import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired 
    private UserDetailsServiceImpl userDetailsService; 
    
    @Autowired
    private JwtUtilService jwtUtilService;
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestTokenHeader = request.getHeader("Authorization");
        String username = null;
        String jwtToken = null;
        if(requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")){
            jwtToken = requestTokenHeader.substring(7);
            try{
                username = this.jwtUtilService.extractUsername(jwtToken);
            }
            catch(ExpiredJwtException expiredJwtException){
                System.out.println("el token expiro");
            }
            catch(Exception exception){
            exception.printStackTrace();
            }   
        }
        else{
            System.out.println("Token Invalido, no empiza con bearer");
        }
        
        if(username != null && SecurityContextHolder.getContext().getAuthentication() == null ){
           UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
           if(this.jwtUtilService.validateToken(jwtToken, userDetails)){
               UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
           }
        }
        
            
    }
    
}
