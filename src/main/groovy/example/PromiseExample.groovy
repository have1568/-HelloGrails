package example

import grails.async.Promise
import grails.async.Promises


class PromiseExample {

    Promise executeTask(Closure<?> c) {

        def res = Promises.task(c)
        return res
    }
}
