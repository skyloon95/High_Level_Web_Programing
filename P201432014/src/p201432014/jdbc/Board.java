package p201432014.jdbc;

import java.util.List;

public class Board {
	int id;
	String boardName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	
	public static String BoardName(List<Board> list, int id) {
		String tmp = "";
		for(Board b : list) {
			if(b.getId() == id)
				tmp = b.getBoardName();
		}
		return tmp;
	}
}
