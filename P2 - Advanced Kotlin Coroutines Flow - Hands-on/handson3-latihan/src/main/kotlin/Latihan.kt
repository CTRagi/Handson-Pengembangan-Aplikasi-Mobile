import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class CounterManager {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count.asStateFlow()

    fun increment() {
        _count.value += 1
    }

    fun decrement() {
        if (_count.value > 0) {
            _count.value -= 1
        }
    }

    fun reset() {
        _count.value = 0
    }
}

fun main() = runBlocking {
    val counter = CounterManager()

    val job = launch {
        counter.count.collect { 
            println("Count: $it")
        }
    }

    delay(100)
    counter.increment()
    delay(100)
    counter.increment()
    delay(100)
    counter.decrement()
    delay(100)
    counter.reset()
    delay(100)

    job.cancel()
}