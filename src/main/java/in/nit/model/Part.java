package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Part {
	@Id
	private Integer partId;
	private String partCode;
	private Double partWidth;
	private Double partLength;
	private Double partHeight;
	private String partDesc;
	
	public Part() {
		super();
	}

	public Integer getPartId() {
		return partId;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public String getPartCode() {
		return partCode;
	}

	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}

	public Double getPartWidth() {
		return partWidth;
	}

	public void setPartWidth(Double partWidth) {
		this.partWidth = partWidth;
	}

	public Double getPartLength() {
		return partLength;
	}

	public void setPartLength(Double partLength) {
		this.partLength = partLength;
	}

	public Double getPartHeight() {
		return partHeight;
	}

	public void setPartHeight(Double partHeight) {
		this.partHeight = partHeight;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public Part(Integer partId) {
		super();
		this.partId = partId;
	}

	@Override
	public String toString() {
		return "Part [partId=" + partId + ", partCode=" + partCode + ", partWidth=" + partWidth + ", partLength="
				+ partLength + ", partHeight=" + partHeight + ", partDesc=" + partDesc + "]";
	}
	
	
	
	

}
