package CoinBundle;

public enum Product {
    ÄPPLE(1,"Äpple",1200), PÄRÖN(2,"Pärön",45), CITRON(3,"Citron",35),BANNER(4,"Banner",33),GURKA(5,"Gurka",18);

    private int id;
    private String name;
    private int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public static Product valueOf(int productSelected){
        for (Product product: Product.values()){
        if (productSelected == product.getId()){
            return product;
        }
        }
        return null;
    }
}
