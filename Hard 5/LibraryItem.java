public abstract class LibraryItem{
    private String title;
    private String id;
    private boolean isAvailable;

    public LibraryItem(String title, String id, boolean isAvailable){
        this.title = title;
        this.id = id;
        this.isAvailable = true;;
    }

    public abstract String getInfo();

    public String getTitle(){return title;}
    public String getId(){return id;}
    public boolean isAvailable(){return isAvailable;}
    public void setAvailable(boolean isAvailable){this.isAvailable = true;}


}