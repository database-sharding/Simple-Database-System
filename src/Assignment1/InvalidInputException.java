package Assignment1;

public class InvalidInputException extends DBEngineException{
	
	public InvalidInputException(){
		super();
	}
	
	public InvalidInputException(String m){
		super(m);
	}

}
