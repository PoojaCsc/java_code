package CodeWars;

// Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. 
//If the two numbers are equal return a or b.

//Note: a and b are not ordered!

public class Sum {
	
	public int GetSum(int a, int b)
    {
     //Good luck!
	int sum=0;
     if(a<b){
    	 for(int i = a ; i<=b ; i++)
    		 sum = sum + i;
     }
     else if(b<a) {
    	 for(int i = b ; i<=a ; i++)
    		 sum = sum + i;
     }
     else
    	 return a;
     return sum;
     
    }

	public static void main(String[] args) {
		Sum s= new Sum();
		System.out.println(s.GetSum(0, -1));
		System.out.println(s.GetSum(-1, 2));
		System.out.println(s.GetSum(2, -1));
		System.out.println(s.GetSum(-1, -1));
		System.out.println(s.GetSum(1, 2));
		

	}

}
