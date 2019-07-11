public class ShopTest {
    public static void main(String[] args) {
        Category category1 = new Category("Narzedzia", "narzedzia do warsztatu");
        Category category2 = new Category("Kuchnia", "przedmioty kuchenne");

        Product tooll = new Product( "Mlotek", 25, "mlotek maly", category1);
        Product tool2 = new Product( "Srubokret", 7, "gwiazdkowy", category1);
        Product kitchen1 = new Product( "Noz", 3, "noz do chleba", category2);
        Product media1 = new Product("telewizor", 3450, "LED TV");

        SpecialOffer offer1 = new SpecialOffer(tooll, "przecena 25%", "25-06-2019", "01-08-2019", 0.2);

        tooll.showProductCategory();
        offer1.showOffer();
        kitchen1.showProductCategory();
        tool2.showProductCategory();
        media1.showProduct();

    }
}
