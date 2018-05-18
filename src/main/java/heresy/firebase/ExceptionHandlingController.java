package heresy.firebase;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlingController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public void defaultExceptionHandler() {
        // Nothing to do
    }

    @ExceptionHandler(TokenInvalidException.class)
    public ResponseEntity<ApiErrorResponse> invalidToken(TokenInvalidException ex) {
        ApiErrorResponse response = new ApiErrorResponse();
        response.setErrorCode(ex.getMyMessage());
        response.setErrorMessage(ex.getMessage());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
