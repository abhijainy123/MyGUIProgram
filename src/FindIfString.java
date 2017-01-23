
public class FindIfString {
	
	public static boolean ifString(char data[])
	{
		//String s = "qweqwe12321";
		//char data [] = s.toCharArray();
		
		boolean ifstring = false;
		try {	
		if(data.length!=0){
		for(int i=0; i <= data.length; i++){
			System.out.println(data[i]);
			if(Character.isLetter(data[i])){
			ifstring = true;
			break;
			}			
			else{
				ifstring = false;		
			}
			}
		
		}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
		}
		return ifstring;
	}
	
	
}
