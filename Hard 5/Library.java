import java.util.ArrayList;
import java.util.List;

public class Library<T extends LibraryItem> {
    private List<T> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T findById(String id) throws ItemNotFoundException {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        throw new ItemNotFoundException("Item not found");
    }

    public List<T> getAvailableItems() {
        List<T> available = new ArrayList<>();
        for (T item : items) {
            if (item.isAvailable()) {
                available.add(item);
            }
        }
        return available;
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items);
    }
}