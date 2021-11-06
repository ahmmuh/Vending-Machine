package CoinBundle;

public class CoinBundle {
    public int number1krona;
    public int number5krona;
    public int number10krona;
    public int number20krona;
    public int number50krona;
    public int number100krona;
    public int number500krona;
    public int number1000krona;

    public CoinBundle(int ... enteredCoins){
        this.number1krona = enteredCoins[1];
        this.number5krona = enteredCoins[5];
        this.number10krona = enteredCoins[10];
        this.number20krona = enteredCoins[20];
        this.number50krona = enteredCoins[50];
        this.number100krona = enteredCoins[100];
        this.number500krona = enteredCoins[500];
        this.number1000krona = enteredCoins[1000];

    }


    public int getTotal(){
        int total = 0;
        total = total+this.number1krona*Coin.EN_KRONA.getValue();
        total = total+this.number5krona*Coin.FEM_KRONA.getValue();
        total = total+this.number10krona*Coin.TIO_KRONA.getValue();
        total = total+this.number20krona*Coin.TJUGO_KRONA.getValue();
        total = total+this.number50krona*Coin.FEMTIO_KRONA.getValue();
        total = total+this.number100krona*Coin.HUNDRA_KRONA.getValue();
        total = total+this.number500krona*Coin.FEMHUNDRA_KRONA.getValue();
        total = total+this.number1000krona*Coin.TUSEN_KRONA.getValue();
        return total;
    }
}
