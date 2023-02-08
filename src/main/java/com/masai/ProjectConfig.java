package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeHttpRequests()
		.anyRequest().permitAll()
		.and().formLogin()
		.and().httpBasic();
		return http.build();
	}
	
	
	
	@Bean	
	public InMemoryUserDetailsManager userDetailsService() {
		
		InMemoryUserDetailsManager iudm = new InMemoryUserDetailsManager();
		
		UserDetails admin= User.withUsername("ratan").password("1234").authorities("admin").build();
		UserDetails user= User.withUsername("ravi").password("1234").authorities("read").build();
		
		iudm.createUser(user);
		iudm.createUser(admin);
		
		return iudm;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	
	
}
