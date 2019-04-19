package hellograils

class HelloController {

    static responseFormats = ['json']

    def index() {
        println(params)
        respond([a: 1, b: 2])
    }
}
