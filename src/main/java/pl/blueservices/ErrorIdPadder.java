package pl.blueservices;

class ErrorIdPadder {
    static String padLeft(String errorId, char character, int minLength) {
        return String.format("%1$" + minLength + "s", errorId)
                .replace(' ', character);
    }
}
