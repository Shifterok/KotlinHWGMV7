package homework6.data

data class ThreadInComment(
    val count: Int = 10,
    val items: Any = Any(),
    val canPost: Boolean = true,
    val showReplyButton: Boolean = true,
    val groupsCanPost: Boolean = true
)