package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.ShipmentType;

public interface ShipmentTypeRepository extends 
                                                              JpaRepository<ShipmentType, Integer> {

}
