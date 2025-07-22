interface Category {}

class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    double price;
    Product(double p) { price = p; }
}
class Utils {
    static <T extends Product<?>> void applyDiscount(T p, double percent) {
        p.price -= p.price * percent / 100;
    }
}
