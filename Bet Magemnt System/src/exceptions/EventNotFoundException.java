package exceptions;

public class EventNotFoundException extends Exception{
    public EventNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
