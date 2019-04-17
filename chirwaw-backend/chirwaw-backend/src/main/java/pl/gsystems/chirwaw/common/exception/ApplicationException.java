package pl.gsystems.chirwaw.common.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApplicationException extends RuntimeException{
    private BusinessExceptionsCode code;


    @Override
    public String toString() {
        return "ApplicationException{" +
                "code=" + code +
                '}';
    }

    @Override
    public String getMessage() {
        return "ApplicationExceptionMessage{" +
                "code=" + code +
                '}';
    }
}