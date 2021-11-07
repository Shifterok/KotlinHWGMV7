package homework6.data.attachmentable

data class NoteAttachmentAttachment(
    override val typeAttachment: String = "важная заметка",
    override val id: Int = 1,
    override val idOwner: Int = 1,
    val title: String = "название заметки",
    val text: String = "о чем моя заметка",
    val date: Int = 1,
    val comments: Int = 100500,
    val readComments: Int = 1,
    val viewUrl: String = "ссылка на заметку"

) : AttachmentableInterface