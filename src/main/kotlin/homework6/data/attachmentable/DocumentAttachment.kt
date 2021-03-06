package homework6.data.attachmentable

data class DocumentAttachment(
    override var typeAttachment: String = "Doc",
    override var id: Int = -1,
    override var idOwner: Int,
    val ownerId: Int = -1,
    val title: String = "",
    val size: Int = -1,
    val ext: String = "",
    val url: String = "",
    val date: Int = -1,
    val type: Int = 8,
    val preview: DocPreview,
) : Attachment