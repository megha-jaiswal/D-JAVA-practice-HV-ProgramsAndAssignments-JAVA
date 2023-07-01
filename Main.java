// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        InventoryMang obj =new InventoryMang("ABCD", "sgfksfg", 100.00, 2);
        obj.display();
        obj.addItem(new InventoryMang("XYZ", "eyrtuyun", 100.00, 2));
        obj.displayProductList();

        }

    }