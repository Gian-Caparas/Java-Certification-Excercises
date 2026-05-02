public class Main {
    public static void main(String[] args) {

        // Create Library
        Library<LibraryItem> lib = new Library<>();

        // === Test 1: Borrow and Return Flow ===
        try {
            Book b = new Book("Clean Code", "B01", "R. Martin", 431);
            lib.addItem(b);

            Member m = new Member("Pedro", "M01");

            m.borrowItem(b);
            System.out.println(b.isAvailable()); // false

            m.returnItem(b);
            System.out.println(b.isAvailable()); // true

        } catch (LibraryException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------");

        // === Test 2: Already Borrowed ===
        try {
            Book b = new Book("Clean Code", "B01", "R. Martin", 431);
            Member m1 = new Member("Pedro", "M01");

            m1.borrowItem(b);
            new Member("Maria", "M02").borrowItem(b); // should throw

        } catch (LibraryException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("------");

        // === Test 3: Borrow Limit Exceeded ===
        try {
            Member m = new Member("Pedro", "M01");

            LibraryItem item1 = new Book("B1", "1", "A", 100);
            LibraryItem item2 = new Book("B2", "2", "A", 100);
            LibraryItem item3 = new Book("B3", "3", "A", 100);
            LibraryItem item4 = new Book("B4", "4", "A", 100);

            m.borrowItem(item1);
            m.borrowItem(item2);
            m.borrowItem(item3);
            m.borrowItem(item4); // should throw

        } catch (LibraryException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("------");

        // === Test 4: Return Not Borrowed ===
        try {
            Member m3 = new Member("Jose", "M03");
            Book b = new Book("Clean Code", "B01", "R. Martin", 431);

            m3.returnItem(b); // should throw

        } catch (LibraryException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("------");

        // === Test 5: findById Unknown ===
        try {
            Library<LibraryItem> lib2 = new Library<>();
            lib2.findById("GHOST_ID"); // should throw

        } catch (LibraryException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}