import java.util.ArrayList;
import java.util.List;

public class Member implements Borrowable {
    private String name;
    private String memberId;
    private List<LibraryItem> borrowedItems; //storing LibraryItem.
    private static final int MAX_BORROW = 3;


    //In constructor: why i dont need to put the "List<LibraryItem> borrowedItems" in reference
    //Because that list is not coming from outside — it’s born inside the class.
    public Member(String name, String memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    @Override
    public void borrowItem(LibraryItem item) throws LibraryException {
        if(!item.isAvailable()){
            throw new ItemNotAvailableException("Item not available");
        }

        if(borrowedItems.size() >= MAX_BORROW){
            throw new BorrowLimitExceededException("Limit reached");
        }

        borrowedItems.add(item);
        item.setAvailable(false);
    }

    @Override
    public void returnItem(LibraryItem item) throws LibraryException{
        if(!borrowedItems.contains(item)){
            throw new ItemNotFoundException("Item not found in borrowed list");
        }

        borrowedItems.remove(item);
        item.setAvailable(true);
    }

    public List<LibraryItem> getBorrowedItems(){
        return new ArrayList<>(borrowedItems);
    }
    
    public String getName(){return name;}
    public String getMemeberID(){return memberId;}

}
