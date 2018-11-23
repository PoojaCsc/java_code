
public class testRes {

	public static void main(String[] args) {
		String string= "bcdenhgakhhingdd";
		int j = 0;
		char [] newString = string.toCharArray();
		int len = string.length();
		String res = "";
		for(int i =0 ;i < len ; i++ )
		{
			if(newString[i] == 'a' || newString[i] == 'e'|| newString[i] == 'i'|| newString[i] == 'o'|| newString[i] == 'u')
				continue;
			else
				res = res + newString[i];
				
		
		}	
		System.out.println(res);

	}

}
