package car.dto;

/**
 * Address에 관한 DTO
 * 
 * @author hyunmoYang
 */
public class AddressDto {
	private int addrNum;
	private String addrName;
	
	public AddressDto() {}
	public AddressDto(int addrNum, String addrName) {
		this.addrNum = addrNum;
		this.addrName = addrName;
	}

	public int getAddrNum() {
		return addrNum;
	}
	public void setAddrNum(int addrNum) {
		this.addrNum = addrNum;
	}
	public String getAddrName() {
		return addrName;
	}
	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddressDto [addrNum=");
		builder.append(addrNum);
		builder.append(", addrName=");
		builder.append(addrName);
		builder.append("]");
		return builder.toString();
	}
} // end of class
