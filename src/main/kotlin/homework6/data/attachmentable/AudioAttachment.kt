package homework6.data.attachmentable

data class AudioAttachment(
    override val typeAttachment: String = "хорошая песня",
    override val id: Int = 1,
    override val idOwner: Int = 1,
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
) : AttachmentableInterface