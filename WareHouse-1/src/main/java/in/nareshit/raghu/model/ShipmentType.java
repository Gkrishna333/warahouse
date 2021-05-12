package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionType;

import lombok.Data;

@Data
@Entity
public class ShipmentType {
	@Id
	@GeneratedValue(generator = "gen" ,strategy = GenerationType.AUTO)
	@Column(name = "ship_id")
	  private Integer shipId;

	@Column(name = "ship_mode")
	  private String  shipMode;
	
	@Column(name = "ship_code")
	  private String  shipCode;
	
	@Column(name = "enable_code")
	  private String  enableShip;
	@Column(name = "ship_grade")
	  private String   shipGrade;
	  @Column(name = "ship_desc")
	  private String   shipDesc;

}
