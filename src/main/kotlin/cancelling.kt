import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking{
    var job = GlobalScope.launch {
        repeat(1000) {
            delay(100)
            print(".")
        }
    }
    delay(2500)
    //job.cancel()
    //job.join()
    job.cancelAndJoin()
    println("done")
}