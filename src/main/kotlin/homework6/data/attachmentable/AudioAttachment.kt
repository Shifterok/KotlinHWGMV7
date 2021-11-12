package homework6.data.attachmentable

abstract class AudioAttachment(
    val type: String = "хорошая песня",
    override var id: Int = 1,
    override var idOwner: Int = 1,
    val artist: String = "автор",
    val title: String = "название",
    val duration: Int = 125,
    val url: String = "ссылка",
    val lyriksId: Int = 1,
    val albumId: Int = 1,
    val genreId: Int = 1,
    val date: Int = 1,
    val noSearch: Boolean = true,
    val isHQ: Boolean = true
) : Attachment