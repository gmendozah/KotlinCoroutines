import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope.coroutineContext

fun main(args: Array<String>) = runBlocking{
    val job = GlobalScope.launch {
        //coroutineContext[job]!!.isActive
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