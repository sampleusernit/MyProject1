package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShipmentType {

	@Id
	@GeneratedValue
	@Column(name = "sid")
	private Integer shipId;
	@Column(name = "smode")
	private String shipMode;
	@Column(name = "scode")
	private String shipCode;
	@Column(name = "sgrd")
	private String shipGrade;
	private String shipEnb;
	private String shipDesc;

	public ShipmentType() {
		super();
	}

	public ShipmentType(Integer id) {
		this.shipId = id;
	}

	public String getShipEnb() {
		return shipEnb;
	}

	public void setShipEnb(String shipEnb) {
		this.shipEnb = shipEnb;
	}

	public String getShipDesc() {
		return shipDesc;
	}

	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}

	public Integer getShipId() {
		return shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public String getShipMode() {
		return shipMode;
	}

	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public String getShipGrade() {
		return shipGrade;
	}

	public void setShipGrade(String shipGrade) {
		this.shipGrade = shipGrade;
	}

	@Override
	public String toString() {
		return "ShipmentType [shipId=" + shipId + ", shipMode=" + shipMode + ", shipCode=" + shipCode + ", shipGrade="
				+ shipGrade + ", shipEnb=" + shipEnb + ", shipDesc=" + shipDesc + "]";
	}

}
