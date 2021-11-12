package homework6.data

import homework6.data.attachmentable.Attachment

data class Comment (
    val id: Int = -1,
    val fromId: Int = -1,
    val date: Int = -1,
    val text: String = "",
    val donut: Any = "",
    val replyToUser: Int = -1,
    val replyToComment: Int = -1,
    val attachments:Array<Attachment> = emptyArray(),
    val parentsStack: Array<Int> = emptyArray(),
    val thread: ThreadInComment =ThreadInComment()
)