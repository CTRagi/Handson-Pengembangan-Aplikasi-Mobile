import kotlinx.coroutines.*

suspend fun fetchUserProfile(userId: String): String {
    delay(1000)
    return "User: John Doe"
}

suspend fun fetchUserPosts(userId: String): List<String> {
    delay(800)
    return listOf("Post 1", "Post 2", "Post 3")
}

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()

    val tundaProfil = async { 
        fetchUserProfile("123")
    }
    
    val tundaPost = async { 
        fetchUserPosts("123")
    }

    val profil = tundaProfil.await()
    val post = tundaPost.await()

    println(profil)
    println("Post: $post")

    val endTime = System.currentTimeMillis()
    println("Waktu: ${endTime - startTime}ms")
}