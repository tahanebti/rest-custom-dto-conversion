package com.tahanebti.restcrud.dto;

import lombok.Data;

@Data
public class LocationDto {
	private Long locationId;
	private double lat;
	private double lng;
	private String place;
}
