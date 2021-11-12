package homework6.data.attachmentable

data class NoteAttachmentAttachment(
    override var typeAttachment: String = "важная заметка",
    override var id: Int = 1,
    override var idOwner: Int = 1,
    val title: String = "название заметки",
    val text: String = "о чем моя заметка",
    val date: Int = 1,
    val comments: Int = 100500,
    val readComments: Int = 1,
    val viewUrl: String = "ссылка на заметку"

) : Attachment