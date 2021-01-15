package com.tahanebti.restcrud.converter;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.tahanebti.restcrud.domain.Location;
import com.tahanebti.restcrud.domain.User;
import com.tahanebti.restcrud.dto.LocationDto;
import com.tahanebti.restcrud.dto.UserDto;


public class UserConverter implements Converter<User, UserDto> {

	private final Function<Location, LocationDto> locationResolver;
	

	public UserConverter(Function<Location, LocationDto> locationResolver) {
		this.locationResolver = locationResolver;
	}







	public UserConverter(Object locationResolver) {
		this.locationResolver = (Function<Location, LocationDto>) locationResolver;
	}







	@Override
	public UserDto convert(User user) {
		UserDto userDto = new UserDto();
		userDto.setUserId(user.getId());
		userDto.setName(user.getName());
        LocationDto location = locationResolver.apply(user.getLocation());
        userDto.setLocation(location);
        return userDto;
	}

	@Override
	public JavaType getInputType(TypeFactory typeFactory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaType getOutputType(TypeFactory typeFactory) {
		// TODO Auto-generated method stub
		return null;
	}

}
