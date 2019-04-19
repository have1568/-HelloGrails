package hellograils

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class HelloControllerSpec extends Specification implements ControllerUnitTest<HelloController> {

    def setup() {

    }

    def cleanup() {
    }

    void "test hello index"() {
        when:
        params.put("a",1)
        controller.index()

        then:
        status == 200
        println(response.text)
        true
    }
}
