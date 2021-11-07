package homework6.data.attachmentable

data class DocumentAttachment(
    override val typeAttachment: String = "Doc",
    override val id: Int = -1,
    override val idOwner: Int,
    val ownerId: Int = -1,
    val title: String = "",
    val size: Int = -1,
    val ext: String = "",
    val url: String = "",
    val date: Int = -1,
    val type: Int = 8,
    val preview: DocPreview,
) : AttachmentableInterface