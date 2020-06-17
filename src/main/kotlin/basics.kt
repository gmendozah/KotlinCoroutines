import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.awt.PrintGraphics


fun main(args: Array<String>) {
    GlobalScope.launch {
        print("Hello")
        delay(1000)
    }
}

suspend fun toDo() {
    print("World")
}