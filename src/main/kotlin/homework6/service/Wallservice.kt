package homework6.service

import homework6.data.Comment
import homework6.data.Post
import homework6.data.attachmentable.exeptionsClass.PostNotFoundException

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

    private var comments = emptyArray<Comment>()
    fun createNewComment(comment: Comment) {
        if (posts.none {
                it.id == comment.id // явное указание на проверку ИД, как просили в на проверке ДЗ
            }) {
            throw PostNotFoundException()
        } else {
            comments = comments.plus(comment)
        }
    }
}