package com.tahanebti.restcrud.domain;

import java.util.Objects;
import java.util.StringJoiner;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class User {
	
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private Long id;
	    private String name;	 
	    
	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "location_id")
	    private Location location;
}
