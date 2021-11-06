package CoinBundle;

public class TextBasedVendingMachine implements VendingMachine{

    private int selectedProduct;
    private CoinBundle change;
    @Override
    public void displayProducts() {
    System.out.println(" *************************************");
        System.out.println("       Welcome to Vending Machine     ");
        System.out.println(" *************************************");


        System.out.println("     Products available               ");
        System.out.println("                                       ");


    for (Product product: Product.values()){
        System.out.println("Product ID " + product.getId() + " Price : " + product.getPrice() + " Name: " + product.getName());
    }

        System.out.println("                         ");

        System.out.println("Please select a product ");
    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;

    }

    @Override
    public void displayEnterCoinsMessage() {

        System.out.println("Welcome and consider to read the following instructions before you choose product");

    }

    @Override
    public void enterCoins(int... coins) {
    Calculator calculator = new SimpleCalculator();
    Product product = Product.valueOf(this.selectedProduct);
    int total = calculator.calculateTotal(new CoinBundle(coins));
    int changeAmount = total - product.getPrice();
    this.change = calculator.calculateChange(changeAmount);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                       ");
        System.out.println("Dina ändringar är  :"+ change.getTotal());
        System.out.println("    1 kr: "+ change.number1krona);
        System.out.println("    5 kr: "+ change.number5krona);
        System.out.println("    10 kr: "+ change.number10krona);
        System.out.println("    20 kr: "+ change.number20krona);
        System.out.println("    50 kr: "+ change.number50krona);
        System.out.println("    100 kr: "+ change.number100krona);
        System.out.println("    500 kr: "+ change.number500krona);
        System.out.println("    1000 kr: "+ change.number1000krona);

    }
}
