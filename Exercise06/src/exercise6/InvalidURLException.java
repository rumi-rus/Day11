package exercise6;

public class InvalidURLException extends Exception {
	public InvalidURLException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}
