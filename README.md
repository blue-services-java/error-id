# About
Simple Error class with generated ID, which simplifies troubleshooting. The ID should be presented to the user and logged.

# Example
The below example show how to use the `Error` in the Spring Web application:
```java
@ExceptionHandler({
        Exception.class
})
public final ResponseEntity<Error> handleUnknownException(Exception ex) {
    Error error = new Error(ex.getMessage());
    log.error("Unknown error. Message: {}, errorId: {}.", error.getMessage(), error.getId(), ex);
    return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
}
```
