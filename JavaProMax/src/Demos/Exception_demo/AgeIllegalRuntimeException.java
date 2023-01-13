package Demos.Exception_demo;

public class AgeIllegalRuntimeException extends RuntimeException{

    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }

}
