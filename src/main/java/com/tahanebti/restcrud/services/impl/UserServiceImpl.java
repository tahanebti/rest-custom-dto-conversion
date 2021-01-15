package com.tahanebti.restcrud.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.tahanebti.restcrud.domain.Location;
import com.tahanebti.restcrud.domain.User;
import com.tahanebti.restcrud.dto.UserLocationDto;
import com.tahanebti.restcrud.repository.UserRepository;
import com.tahanebti.restcrud.services.UserService;





public class UserServiceImpl implements UserService{

	 @Autowired
	 private UserRepository userRepository;	
	
	@Override
	public List<UserLocationDto> getAllUsersLocation() {
		
	      return ((List<User>) userRepository
	                .findAll())
	                .stream()
	                .map(this::convertToUserLocationDTO)
					        .collect(Collectors.toList());
	}
	
    private UserLocationDto convertToUserLocationDTO(User user) {
    	UserLocationDto userLocationDTO = new UserLocationDto();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setUsername(user.getName());
        Location location = user.getLocation();
        userLocationDTO.setLat(location.getLat());
        userLocationDTO.setLng(location.getLng());
        userLocationDTO.setPlace(location.getPlace());
        return userLocationDTO;
}

	
	
	



	

}
