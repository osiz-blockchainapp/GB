package org.tron.core.exception;

public class LgcyRuntimeException extends RuntimeException {

  public LgcyRuntimeException() {
    super();
  }

  public LgcyRuntimeException(String message) {
    super(message);
  }

  public LgcyRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

  public LgcyRuntimeException(Throwable cause) {
    super(cause);
  }

  protected LgcyRuntimeException(String message, Throwable cause,
      boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }


}
