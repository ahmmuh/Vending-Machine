package CoinBundle;

public class SimpleCalculator implements Calculator{
    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        return 0;
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.number1000krona = remainingAmount / Coin.TUSEN_KRONA.getValue();
        remainingAmount = remainingAmount % Coin.TUSEN_KRONA.getValue();

        change.number500krona = remainingAmount / Coin.FEMHUNDRA_KRONA.getValue();
        remainingAmount = remainingAmount % Coin.FEMHUNDRA_KRONA.getValue();

        change.number100krona = remainingAmount / Coin.HUNDRA_KRONA.getValue();
        remainingAmount = remainingAmount % Coin.HUNDRA_KRONA.getValue();

        change.number50krona = remainingAmount / Coin.FEMTIO_KRONA.getValue();
        remainingAmount = remainingAmount % Coin.FEMTIO_KRONA.getValue();



        change.number20krona = remainingAmount / Coin.TJUGO_KRONA.getValue();
        remainingAmount = remainingAmount % Coin.TJUGO_KRONA.getValue();


        change.number10krona = remainingAmount / Coin.TIO_KRONA.getValue();
        remainingAmount = remainingAmount % Coin.TIO_KRONA.getValue();


        change.number5krona = remainingAmount / Coin.FEM_KRONA.getValue();
        remainingAmount = remainingAmount % Coin.FEM_KRONA.getValue();


        change.number1krona = remainingAmount / Coin.EN_KRONA.getValue();
        remainingAmount = remainingAmount % Coin.EN_KRONA.getValue();

        return change;
    }
}
