package homework6.service

import homework6.data.Comment
import homework6.data.Post
import homework6.data.attachmentable.exeptionsClass.PostNotFoundException
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WallServiceTest {

    @Test
    fun add_checkingId() {
        val wallService = WallService()
        var resoult = Post()
        resoult = wallService.add(resoult)
        assertNotEquals(resoult.id, 0)
    }

    @Test
    fun update_areThisIsUpdate() {
        val wallService = WallService()
        var resoult = Post()
        resoult = wallService.add(resoult)
        assertTrue(wallService.update(resoult))
    }

    @Test
    fun update_areThisNotUpdate() {
        val wallService = WallService()
        assertFalse(wallService.update(Post()))
    }

    @Test(expected = PostNotFoundException::class) // Но вот тут я не понимаю почему expexted дает ошибку
    fun shouldThrow() {
        val wallService = WallService()
        wallService.add(Post())
        wallService.createNewComment(Comment(2))
    }
}