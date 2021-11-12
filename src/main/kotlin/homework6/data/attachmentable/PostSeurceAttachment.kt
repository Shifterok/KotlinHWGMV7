package homework6.data.attachmentable

data class PostSource(
    override val typeAttachment: String = "Источник поста",

    val type: String = "название источника",
    val platform: String = "андроид, только андроид!!!",
    val date: Int = 1,
    val url: String = "ссылка куда то"
) : Attachment {
    override val id: Int
        get() = TODO("Not yet implemented")
    override val idOwner: Int
        get() = TODO("Not yet implemented")
}