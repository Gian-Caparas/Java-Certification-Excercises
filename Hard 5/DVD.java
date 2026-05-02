public class DVD extends LibraryItem{
    private String director;
    private int durationMinutes;

    public DVD(String title, String id, String director, int durationMinutes){
        super(title, id, true);
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getInfo() {
        return "DVD: " + getTitle() + " directed by " + director + " (" + durationMinutes + "min)";
    }

}
