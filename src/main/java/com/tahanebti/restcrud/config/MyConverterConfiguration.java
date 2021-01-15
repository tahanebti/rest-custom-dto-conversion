package com.tahanebti.restcrud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.util.Converter;
import com.tahanebti.restcrud.converter.UserConverter;
import com.tahanebti.restcrud.domain.User;
import com.tahanebti.restcrud.dto.UserDto;
import com.tahanebti.restcrud.repository.LocationRepository;

@Configuration
public class MyConverterConfiguration {

	 @Bean
	  public Converter<User, UserDto> userEntityConverter(
	               @Autowired LocationRepository locationRepository
	  ) {
	    return new UserConverter(null);
	  }
}
