package game;

public class Player {
	int num =0;
	public void guess(){
		num = (int)(Math.random() * 10);
		System.out.println("I am guessing number"+num);
	}
}
