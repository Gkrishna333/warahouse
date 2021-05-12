package com.nt.krishna.serviceimple;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.krishna.model.ShipmentType;
import com.nt.krishna.repo.ShipmentTypeRepository;
import com.nt.krishna.service.IShipmentTypeService;


@Service
public class ShipmentTypeServiceImple implements   IShipmentTypeService{
    

	@Autowired
	private ShipmentTypeRepository repo;

	//saving ShipmentType data
 @Override   
 public Integer SaveShipmentType(ShipmentType st) {
           ShipmentType ship= repo.save(st);
	       return ship.getShipId();
}
	//fetch ShipmentType data
   	@Override
   	public java.util.List<ShipmentType> getAllShipmentTypes() {
   		java.util.List<ShipmentType> list =repo.findAll();
   		return list;
   	}
   	
   	@Override
   	public String deleteShipmentTypeById(Integer id) {
   		Optional<ShipmentType> op=repo.findById(id);
   		System.out.println(op.get().toString());
   		if(!op.isEmpty()) {
   			   		repo.deleteById(id);
   			return "Record Deleted  "+op.get().getShipId();
   		}else {
   			return null;
   		}
   		
   	}//end of delete method
	  
   	@Override
   	public ShipmentType editShipmentType(Integer id) {
   		Optional<ShipmentType> op=repo.findById(id);
   		if(op.isPresent()) {
   			return op.get();
   		}else {
   		 return null;	
   		}
   		
   	}
}
