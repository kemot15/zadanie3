public class SpecialOffer {
    Product product;
    String offerInfo;
    String dataStart;
    String dataEnd;
    double disscount;

    public SpecialOffer(Product product, String offerInfo, String dataStart, String dataEnd, double disscount) {
        this.product = product;
        this.offerInfo = offerInfo;
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.disscount = disscount;
    }

    void showOffer (){
        double newPrice = product.price - disscount * product.price;
        System.out.println(product.productName + " " + offerInfo + " od: " + dataStart + " do: " + dataEnd + " Znizka: " + disscount + " Nowa cene: " + newPrice);
    }
}
