package pack03.test;

public class HoresDTO {
	
	private int move , rank;
	private String name;
	private Thread horesThread;
	
	
	public HoresDTO(String name) {
		this.name = name;
	}


	public int getMove() {
		return move;
	}


	public void setMove(int move) {
		if(move > 100 ) {
			move = 100;
		}
		this.move = move;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Thread getHoresThread() {
		return horesThread;
	}


	public void setHoresThread(Thread horesThread) {
		this.horesThread = horesThread;
	}
	
	
}
