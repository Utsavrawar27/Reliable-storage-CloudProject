package com.reliablestore.storage.config;


import com.reliablestore.storage.service.LoadUserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.reliablestore.storage.customfilter.OAuth2AuthenticationFilter;

@Configuration
public class GenericConfiguration {
  @Bean
  public OAuth2AuthenticationFilter oAuth2AuthenticationFilter() {
	  return new OAuth2AuthenticationFilter();
  }
  
  @Bean
  public LoadUserInfo loadUserInfo() {
	  return new LoadUserInfo();
  }
  
	
}
