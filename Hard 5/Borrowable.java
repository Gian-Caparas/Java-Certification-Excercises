public interface Borrowable {
    void borrowItem(LibraryItem item) throws LibraryException;
    void returnItem(LibraryItem item) throws LibraryException;
}