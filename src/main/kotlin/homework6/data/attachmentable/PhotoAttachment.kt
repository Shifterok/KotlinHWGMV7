package homework6.data.attachmentable

data class PhotoAttachment(
    override val typeAttachment: String = "Photo",
    override val id: Int = -1,
    val albumId: Int = -1,
    override val idOwner: Int = -1,
    val useId: Int = -1,
    val text: String = "",
    val date: Int = 0,
    val width: Int = 0,
    val height: Int = 0,
) : AttachmentableInterface