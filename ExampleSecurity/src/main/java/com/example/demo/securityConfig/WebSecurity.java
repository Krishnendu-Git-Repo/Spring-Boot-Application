package com.example.demo.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
		.withUser("user")
		.password("user")
		.roles("USER").and()
		.withUser("admin")
		.password("admin")
		.roles("ADMIN");
	}
	
	
	@Bean
	protected PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	    .csrf()
	    .disable()
	    .authorizeRequests()
	    .antMatchers("/").permitAll()
	    .antMatchers("/admin").hasRole("ADMIN")
	    .antMatchers("/get/{bookid}").hasAnyRole("ADMIN","USER")
		.antMatchers("/post").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
	    .antMatchers("/**").authenticated()
	    .and().httpBasic();
		
	}
}
