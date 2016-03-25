package Assignment1;

public class TableDoesNotExistException extends DBEngineException {

	
	public TableDoesNotExistException(){
		super();
	}
	
	
	public TableDoesNotExistException(String m){
		super(m);
	}
}
