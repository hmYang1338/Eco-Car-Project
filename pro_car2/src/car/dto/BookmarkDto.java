package car.dto;

/**
 * 즐겨찾기에 관한 DTO
 * 
 * @author hyunmoYang
 */
public class BookmarkDto {
	private int bNum;
	private String id;
	private int sId;
	
	public BookmarkDto() {}
	public BookmarkDto(int bNum, String id, int sId) {
		this.bNum = bNum;
		this.id = id;
		this.sId = sId;
	}

	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookmarkDto [bNum=");
		builder.append(bNum);
		builder.append(", id=");
		builder.append(id);
		builder.append(", sId=");
		builder.append(sId);
		builder.append("]");
		return builder.toString();
	}
} // end of class
