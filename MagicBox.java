import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {

    private T item;
    private int itemNumber;
    private T[] itemsInBox;
    private Random random = new Random();

    public MagicBox(int itemNumber) {
        this.itemNumber = itemNumber;
        itemsInBox = (T[]) new Object[itemNumber];
    }

    public boolean add(T item) {
        for (int i = 0; i < itemNumber; i++) {
            if (itemsInBox[i] == null) {
                itemsInBox[i] = item;
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public T pick() {
        int itemsToFull = 0;
        int randomInt = -1;
        for (int i = 0; i < itemNumber; i++) {
            if (itemsInBox[i] == null) {
                itemsToFull++;
            }
        }
        if (itemsToFull > 0) {
            throw new RuntimeException(String.valueOf(itemsToFull));
        } else {
            randomInt = random.nextInt(itemNumber);
            return itemsInBox[randomInt];
        }
    }
}
