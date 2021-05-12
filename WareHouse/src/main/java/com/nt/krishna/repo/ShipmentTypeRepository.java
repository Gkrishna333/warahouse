package com.nt.krishna.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.krishna.model.ShipmentType;



public interface ShipmentTypeRepository extends 
                                                              JpaRepository<ShipmentType, Integer> {

}
