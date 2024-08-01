package system
abstract class Library {
    abstract var title:String
    abstract var author:String
    var year:Int=0
}
abstract class book{
    abstract fun addBook(book:book)
    abstract fun view()
    abstract fun author(author:String)

}