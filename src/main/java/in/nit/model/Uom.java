package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uomtab")
public class Uom {
	@Id
	@GeneratedValue
	private Integer uomId;
	private String uomType;
	private String uomMode;
	private String uomDesc;
	public Uom() {
		super();
	}
	public Uom(Integer id) {
		this.uomId=id;
	}
	public String getUomType() {
		return uomType;
	}
	public void setUomType(String uomType) {
		this.uomType = uomType;
	}
	public String getUomMode() {
		return uomMode;
	}
	public void setUomMode(String uomMode) {
		this.uomMode = uomMode;
	}
	public String getUomDesc() {
		return uomDesc;
	}
	public void setUomDesc(String uomDesc) {
		this.uomDesc = uomDesc;
	}
	public Integer getUomId() {
		return uomId;
	}
	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}
	@Override
	public String toString() {
		return "Uom [uomId=" + uomId + ", uomType=" + uomType + ", uomMode=" + uomMode + ", uomDesc=" + uomDesc + "]";
	}


}
