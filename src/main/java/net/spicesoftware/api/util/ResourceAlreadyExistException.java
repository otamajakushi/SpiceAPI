package net.spicesoftware.api.util;

/**
 * @since 2014/12/23
 */
public class ResourceAlreadyExistException extends RuntimeException {

    public ResourceAlreadyExistException() {
    }

    public ResourceAlreadyExistException(String message) {
        super(message);
    }

    public ResourceAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceAlreadyExistException(Throwable cause) {
        super(cause);
    }

    public ResourceAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
