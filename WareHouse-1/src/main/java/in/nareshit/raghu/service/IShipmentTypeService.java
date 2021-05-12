package in.nareshit.raghu.service;



import in.nareshit.raghu.model.ShipmentType;

public interface IShipmentTypeService {
  
	public Integer SaveShipmentType(ShipmentType st);
	public java.util.List<ShipmentType> getAllShipmentTypes();
	public  String deleteShipmentTypeById(Integer id);
	public  ShipmentType editShipmentType(Integer id);
}
