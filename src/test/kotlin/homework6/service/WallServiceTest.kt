package homework6.service

import homework6.data.Post
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
}