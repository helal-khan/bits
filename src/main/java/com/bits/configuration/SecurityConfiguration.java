package com.bits.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Autowired
	UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable()
	        .authorizeRequests()
	        .antMatchers("/registration", "/js/**", "/css/**", "/img/**", "/webjars/**").permitAll()
//	        .antMatchers("/").hasAuthority("ROLE_ADMIN")
	        .anyRequest().authenticated()
	    .and()
	        .formLogin()
	        .loginPage("/login").permitAll()
	        .failureUrl("/login?error=true")
	        //.defaultSuccessUrl("/home")
	    .and()
	    	.logout()
	        .invalidateHttpSession(true)
	        .clearAuthentication(true)
	        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	        .logoutSuccessUrl("/login?logout").permitAll()
	    .and()
	    	.exceptionHandling()
	        .accessDeniedPage("/access-denied");
	}
	
	

}
