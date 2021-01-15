package com.tahanebti.restcrud.dto;


import com.tahanebti.restcrud.domain.User;

import lombok.Data;

@Data
public class UserLocationDto {

	private Long userId;
	private String username;
	private double lat;
	private double lng;
	private String place;
	
	
	private UserLocationDto toDto(User person) {
		return new UserLocationDto();
	}
}
