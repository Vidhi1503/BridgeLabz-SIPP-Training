import java.util.*;
abstract class WarehouseItem { String name; }

class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void add(T item) {
        items.add(item);
    }
    static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items)
            System.out.println(i.getClass().getSimpleName());
    }
}
