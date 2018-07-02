package car.dto;

/**
 * 충전소에 관한 DTO
 * 
 * @author hyunmoYang
 */
public class StationDto {
	private int sId;
	private String sName;
	private String addr;
	private String type;
	private String latitude;
	private String longitude;
	private int addrNum;

	public StationDto() {}
	public StationDto(int sId, String sName, String addr, String type, String latitude, String longitude, int addrNum) {
		this.sId = sId;
		this.sName = sName;
		this.addr = addr;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
		this.addrNum = addrNum;
	}

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getAddrNum() {
		return addrNum;
	}
	public void setAddrNum(int addrNum) {
		this.addrNum = addrNum;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StationDto [sId=");
		builder.append(sId);
		builder.append(", sName=");
		builder.append(sName);
		builder.append(", addr=");
		builder.append(addr);
		builder.append(", type=");
		builder.append(type);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", addrNum=");
		builder.append(addrNum);
		builder.append("]");
		return builder.toString();
	}
} // end of class
