package example

import grails.async.Promise
import spock.lang.Specification

import java.time.LocalDateTime
import java.util.concurrent.TimeUnit

class PromiseExampleTest extends Specification {

    PromiseExample example = new PromiseExample();

    def "executeTask"() {

        when:
        println("1===>" + LocalDateTime.now().toString())
        Promise p = example.executeTask {
            println("2===>" + LocalDateTime.now().toString())
            Thread.sleep(1000)
            println("test task !")
            return "OK"
        }

        then:
        println("3===>" + LocalDateTime.now().toString())
        p.onComplete { result ->
            println(LocalDateTime.now().toString())
            println("done !")
        }

        // def result = p.get()
        // block for the specified time
        println("4===>" + LocalDateTime.now().toString())
       def result = p.get(1, TimeUnit.MINUTES)
//
//        println("5===>" + LocalDateTime.now().toString())
//        println(result)
    }
}
