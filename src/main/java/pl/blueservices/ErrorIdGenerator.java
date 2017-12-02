package pl.blueservices;

import java.util.concurrent.ThreadLocalRandom;

public class ErrorIdGenerator {
    private static final int MIN_LENGTH = 16;
    private static final char PAD_CHAR = '0';

    static String generate() {
        long errorId = ThreadLocalRandom.current().nextLong();
        String errorIdString = Long.toHexString(errorId);
        return ErrorIdPadder.padLeft(errorIdString, PAD_CHAR, MIN_LENGTH);
    }
}
