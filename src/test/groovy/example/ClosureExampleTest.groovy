package example

import spock.lang.Specification

class ClosureExampleTest extends Specification {


    void "test simple closure"() {

        when: "execute testClosure method "
        def res = ClosureExample.testClosure("123")
        println res
        then: ""
        println "done !"

    }
}
