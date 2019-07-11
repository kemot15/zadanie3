public class Product {
    String productName;
    double price;
    String productInfo;
    Category category;

    Product(String productName, double price, String productInfo) {
        this.productName = productName;
        this.price = price;
        this.productInfo = productInfo;
    }

    Product(String productName, double price, String productInfo, Category category) {
        this.productName = productName;
        this.price = price;
        this.productInfo = productInfo;
        this.category = category;
    }



    void showProductCategory(){
        System.out.println("Nazwa produktu: " + productName + "\ncena: " + price + "\nInfo: " + productInfo + "\nKategoria: " + category.categoryName + " - " + category.categoryInfo +"\n");
    }

    void showProduct(){
        System.out.println("Nazwa produktu: " + productName + "\ncena: " + price + "\nInfo: " + productInfo + "\nKategoria: "+"\n");
    }
}
