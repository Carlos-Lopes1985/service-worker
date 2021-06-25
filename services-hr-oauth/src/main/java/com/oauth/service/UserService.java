package com.oauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.oauth.entity.User;
import com.oauth.feignclients.UserFeignClient;


@Service
public class UserService implements UserDetailsService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		
		User user = userFeignClient.findByEmail(email).getBody();
		
		if(user == null) {
			logger.error("Email not found "+email);
			throw new IllegalArgumentException("Usuário não existe!");
		}
		
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = userFeignClient.findByEmail(username).getBody();
		
		if(user == null) {
			logger.error("Email not found "+username);
			throw new UsernameNotFoundException("Usuário não existe!");
		}
		
		return user;
	}
}
