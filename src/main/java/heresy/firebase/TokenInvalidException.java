package heresy.firebase;

public class TokenInvalidException extends RuntimeException{

    private String MyMessage;

    public TokenInvalidException(String message, String myMessage) {
        super(message);
        MyMessage = myMessage;
    }

    public String getMyMessage() {
        return MyMessage;
    }
}
