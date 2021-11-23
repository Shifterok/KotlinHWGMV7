package homework6.service

import homework6.data.Comment
import homework6.data.Note

private var notes = emptyList<Note>()
private var comments = emptyList<Comment>()

//Создает новую заметку у текущего пользователя.
fun add(title: String, text: String, privacyView: Array<String>, privacyComment: Array<String>): Int {
    var id: Int = if (notes.isEmpty()) {
        1
    } else {
        notes.last().id + 1
    }
    notes = notes.plus(Note(title, text, arrayOf("can view"), arrayOf("can comment"), 0, 15))
    return id
}

//Добавляет новый комментарий к заметке. guid - убрал
fun createComment(noteId: Int, replyTo: Int, commentText: String): Int {
    var id = if (comments.isEmpty()) {
        1
    } else {
        comments.last().id
    }
    notes.first { it.id == noteId }
    comments = comments.plus(Comment(id = id, fromId = noteId, replyToUser = replyTo, text = commentText))
    return id
}

//Удаляет заметку текущего пользователя
fun delete(noteId: Int): Int {
    val note = notes.first { it.id == noteId }
    note.isDeleted = true
    val commentsToNote = comments.filter { it.fromId == note.id }
    commentsToNote.forEach { it.isDeleted = true }
    return 1
}

//Удаляет комментарий к заметке.
fun deleteComment(commentId: Int): Int {
    val comment = comments.first { it.id == commentId }
    comment.isDeleted = true
    return 1
}

//Редактирует заметку текущего пользователя.
fun edit(noteId: Int, title: String, text: String, privacyView: Array<String>, privacyComment: Array<String>): Int {
    var note = notes.first { it.id == noteId }
    var newNote =
        note.copy(title = title, text = text, privacyView = arrayOf("can view"), privacyComment = privacyComment)
    var noteIndex = notes.indexOf(note)
    var mNotes = notes.toMutableList()
    mNotes[noteIndex] = newNote
    notes = mNotes
    return 1
}

//Редактирует указанный комментарий у заметки.
fun editComment(commentId: Int, message: String): Int {

    val comment = comments.first { it.id == commentId }
    val newComment =
        comment.copy(text = message)
    val commentIndex = comments.indexOf(comment)
    val mComments = comments.toMutableList()
    mComments[commentIndex] = newComment
    comments = mComments
    return 1
}

//Возвращает список заметок, созданных пользователем.
fun get(noteIds: Array<Int>, userIds: Array<Int>, offset: Int, count: Int, sort: Int): List<Note> {
    var list = notes.filter { noteIds.contains(it.id) && userIds.contains(it.ownerId) && !it.isDeleted }
    list = list.filterIndexed { index, _ -> (index >= offset) }
    return list
}

//Возвращает заметку по её id.
fun getById(noteId: Int, ownerId: Int, needWiki: Int): Note {
    return notes.first { it.id == noteId }
}

//Возвращает список комментариев к заметке.
fun getComment(noteId: Int, ownerId: Int, sort: Int, offset: Int, count: Int): List<Comment> {
    var list = comments.filter { noteId == it.fromId && ownerId == it.ownerId && !it.isDeleted }
    list = list.filterIndexed { index, _ -> (index >= offset) }
    val dateComparator = Comparator { comment1: Comment, comment2: Comment -> comment1.date - comment2.date }
    list = if (sort > 0) list.sortedWith(dateComparator) else list.sortedWith(dateComparator).reversed()
    return list
}

//Восстанавливает удалённый комментарий
fun restoreComment(commentId: Int): Int {
        val comment = comments.first { it.id == commentId }
        comment.isDeleted = true
    return 1
}

// job done