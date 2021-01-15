package com.tahanebti.restcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tahanebti.restcrud.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{

}
