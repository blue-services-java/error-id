package pl.blueservices

import spock.lang.Specification

class CreateErrorWithIdTest extends Specification {
    def "should generate error ID without duplicates"() {
        setup:
        def errors = []

        when:
        Thread.start {
            errors.add(new Error("message").getId())
            errors.add(new Error("message").getId())
        }
        Thread.start {
            errors.add(new Error("message").getId())
            errors.add(new Error("message").getId())
        }

        then:
        errors.unique() == errors
    }
}
