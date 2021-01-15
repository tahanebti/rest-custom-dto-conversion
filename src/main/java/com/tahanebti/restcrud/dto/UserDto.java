package com.tahanebti.restcrud.dto;

import lombok.Data;

@Data
public class UserDto {

	private Long userId;
    private String name;
    private LocationDto location;
}
