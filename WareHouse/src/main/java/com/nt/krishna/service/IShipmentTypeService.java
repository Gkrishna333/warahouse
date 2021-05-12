package com.nt.krishna.service;

import com.nt.krishna.model.ShipmentType;

;

public interface IShipmentTypeService {
  
	public Integer SaveShipmentType(ShipmentType st);
	public java.util.List<ShipmentType> getAllShipmentTypes();
	public  String deleteShipmentTypeById(Integer id);
	public  ShipmentType editShipmentType(Integer id);
}
