package car.dto;

/**
 * 게시판2에 관한 DTO
 * 
 * @author hyunmoYang
 */
public class BoardDto {
	private int boardNum;
	private String title;
	private String content;
	private String boardDate;
	private String id;
	
	public BoardDto() {}
	public BoardDto(int boardNum, String title, String content, String boardDate, String id) {
		this.boardNum = boardNum;
		this.title = title;
		this.content = content;
		this.boardDate = boardDate;
		this.id = id;
	}

	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardDto [boardNum=");
		builder.append(boardNum);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content=");
		builder.append(content);
		builder.append(", boardDate=");
		builder.append(boardDate);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
} // end of class
