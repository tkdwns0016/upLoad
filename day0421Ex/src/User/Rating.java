package User;

import Game.blackjack;

public class Rating implements Runnable{
	private static Rating instance = new Rating();

	public static Rating getInstance() {
		return instance;
	}
	@Override
	public void run(blackjack user) {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(user.getMoney()<150000) {
				user.setrating("브론즈");
				break;
			}else if(user.getMoney()<200000){
				user.setrating("실버");
				break;
			}else if(user.getMoney()<300000) {
				user.setrating("골드");
				break;
			}else if(user.getMoney()<500000) {
				user.setrating("플래티넘");
				break;
			}else if(user.getMoney()<1000000) {
				user.setrating("다이아몬드");
				break;
			}else if(user.getMoney()<2000000) {
				user.setrating("그랜드마스터");
				break;
			}else {
				user.setrating("챌린저");
				break;
			}
		}
	}
}
