package homework6.data
import homework6.data.attachmentable.Attachment
import homework6.data.attachmentable.PhotoAttachment
import homework6.data.attachmentable.PostSource

data class Post(
    var id: Int = 10,
    val ownerId: Int = 150,
    val fromId: Int = 120,
    val createdBy: String = "Михаил",
    val date: Int = 2021,
    var text: String = "Какой то текст",
    val replyOwnerId: Int = 15,
    val replyPostId: Int = 150,
    val friendsOnly: Int = 5,
    val comments: Any = "привет как дела",
    val copyright: Any = "привет как дела (2)",
    val likes: Int = 30,
    val reposts: Any = 15,
    val views: Any = 45,
    val postType: String = "тип поста",
    val postSource: PostSource = PostSource(),
    val attachment: List<Attachment>? = listOf<Attachment>(), //Нулябле
    val geo: String = "Где то там далеко, далеко",
    val signerId: Int = 50,
    val copyHistory: List<Post>? = listOf<Post>(), //Нулябле
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Any = "Бублик",
    val postponedId: Int = 5
)
