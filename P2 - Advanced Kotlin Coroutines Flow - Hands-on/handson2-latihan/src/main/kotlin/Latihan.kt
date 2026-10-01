import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.Random

fun temperatureSensor(): Flow<Int> = flow {
    repeat(10) {
        delay(500)
        val temp = Random.nextInt(20, 40)
        emit(temp)
    }
}

fun main() = runBlocking {
    temperatureSensor().filter { 
        it > 30
    }.map { 
        "⚠️ WARNING: Suhu tinggi terdeteksi: ${it}°C"
    }.collect { 
        println(it)
    }
}