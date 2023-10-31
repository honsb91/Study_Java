package test01.board;

public class BoardDTO {
	private String name,detail,writer;
	private int bno;
	public BoardDTO(String name, String detail, String writer, int bno) {
		this.name = name;
		this.detail = detail;
		this.writer = writer;
		this.bno = bno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	
	
}
