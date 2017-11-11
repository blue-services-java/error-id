package pl.blueservices

import spock.lang.Specification

class ErrorIdPadderTest extends Specification {
    def "should pad with zeros"() {
        expect:
        ErrorIdPadder.padLeft(errorId, '0' as char, minLength) == expectedString

        where:
        errorId | minLength || expectedString
        "abc"   | 10        || "0000000abc"
        "abc"   | 4         || "0abc"
        "abc"   | 3         || "abc"
        "abc"   | 2         || "abc"
    }
}
