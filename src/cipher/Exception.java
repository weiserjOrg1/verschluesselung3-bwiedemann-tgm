package cipher;

public class Exception extends java.lang.Exception {
    public Exception(){
        super("Wrong Keyword Exception");
    }
    public Exception(String nachr){
        super(nachr);
    }
}
