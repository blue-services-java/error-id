package pl.blueservices;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Error {
    private final String id = ErrorIdGenerator.generate();
    private final String message;
}
