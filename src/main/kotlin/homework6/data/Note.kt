package homework6.data

data class Note(
    var title: String,//
    var text: String, //
    var privacyView: Array<String>,//
    var privacyComment: Array<String>,//
    val id: Int,
    val ownerId: Int = 0,
    var isDeleted: Boolean = false
)