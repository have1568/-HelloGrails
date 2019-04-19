package example

class ClosureExample {

    static def c = { param ->
        println(" ${param} hello closure !")
        return param
    }

    static String testClosure(String param) {
        return c.call(param)
    }
}
