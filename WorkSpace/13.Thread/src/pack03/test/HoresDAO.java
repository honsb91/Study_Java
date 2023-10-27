package pack03.test;

import java.util.Random;

public class HoresDAO {
	HoresDTO[] horesArr;
	private int rank;

	public HoresDAO(int inputNum) {
		horesArr = new HoresDTO[inputNum];
		for(int i=0; i<horesArr.length; i++) {
			horesArr[i] = new HoresDTO(i+1+".말");
			horesArr[i].setHoresThread(getHorThread(horesArr[i]));
			horesArr[i].getHoresThread().start();
			
		}
	}
	
	public Thread getHorThread(HoresDTO dto) {
		Thread thread = new Thread(()->{
			while(isMove(dto)) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				horesMoving(dto);		
			}
			if(dto.getRank()==0) {
				dto.setRank(++rank);
				if(rank == horesArr.length) {
					finish();
				}
			}
		});
		
		return thread;
	}
	private void finish() {
		System.out.println("순위출력");
		for(int i = 0; i<horesArr.length; i++) {
			System.out.println(horesArr[i].getName() + " " + horesArr[i].getRank() + " 등 ");
		}
		
	}

	public void horesMoving(HoresDTO dto) {
		dto.setMove(dto.getMove() + new Random().nextInt(30)+1);
		System.out.println(dto.getName() + " " + dto.getMove() + " m ");
	}
	
	// 100보다 작은 move값이면 true , false
	public boolean isMove(HoresDTO dto) {
		
		
		
		if(dto.getMove() < 100) {
			return true;
		}
		return false;
		
	}
}
