package game;

public class GuessGame {
	
  Player player1;
  Player player2;
  Player player3;
  
  public void startGame(){
	  player1 = new Player();
	  player2 = new Player();
	  player3 = new Player();
	  
	  int targetNum = (int)(Math.random() * 10);
	 
	  int guessp1 = 0; 
	  int guessp2 = 0;
	  int  guessp3 = 0;
	  
	  while(true){
		  System.out.println("the number to guess is"+ targetNum);
		  
		  player1.guess();
		  player2.guess();
		  player3.guess();
		  
		  guessp1 = player1.num;
		  guessp2 = player2.num;
		  guessp3 = player3.num;
		 
		  
		  if(targetNum == guessp1) {
			  System.out.println("Player 1 gueesed correct");
			  break;
		  }
		  else if(targetNum == guessp2) {
			  System.out.println("Player 2 guessed correct");
			  break;
		  }
		  else if(targetNum == guessp3) {
			  System.out.println("Player 3 guessed correct");
			  break;
		  }
		  else
			  System.out.println("No correct guess.Try again");
		  
	   }
	  
	  
  }
  

}
