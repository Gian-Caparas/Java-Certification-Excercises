public class Magazine extends LibraryItem{
    private String issue;
    private int issueNumber;

    public Magazine(String title, String id, String issue, int issueNumber){
        super(title, id, true);
        this.issue = issue;
        this.issueNumber = issueNumber;
    }

    @Override
    public String getInfo(){
        return "Magazine: " + getTitle() + ", Issue #" + issueNumber;
    }
}
