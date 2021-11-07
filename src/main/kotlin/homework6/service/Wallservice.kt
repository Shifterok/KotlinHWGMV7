package homework6.service
import homework6.data.Post

class WallService {

    var posts = emptyArray<Post>()
    val update = emptyArray<Boolean>()

    fun add(post: Post): Post {
        val anotherPost: Post = when (posts.isEmpty()) {
            true -> post.copy(id = 1)
            false -> post.copy(id = posts.last().id + 1)
        }
        posts = posts.plus(anotherPost)
        return anotherPost
    }
    fun update(post: Post): Boolean {
        for ((index, anotherPost) in posts.withIndex()) {
            if (anotherPost.id == post.id) {
                val newPost = post.copy(ownerId = anotherPost.ownerId, date = anotherPost.date)
                posts[index] = newPost
                return true
            }
        }
        return false
    }
}