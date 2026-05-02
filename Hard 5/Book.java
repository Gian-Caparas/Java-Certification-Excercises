public class Book extends LibraryItem{
    private String author;
    private int pages;

    public Book(String title, String id, String author, int pages){
        super(title, id, true);
        this.author = author;
        this.pages = pages;
    }   

    @Override
    public String getInfo(){
        return "Book: " + getTitle() + " by " + author + " (" + pages + " pp)";
    }
}
