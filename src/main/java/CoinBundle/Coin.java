package CoinBundle;

public enum Coin {
    EN_KRONA(1),FEM_KRONA(5),
    TIO_KRONA(10),TJUGO_KRONA(20),
    FEMTIO_KRONA(50),HUNDRA_KRONA(100),
    FEMHUNDRA_KRONA(500),TUSEN_KRONA(1000);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int[] parseCoins(String coins){
        String[] numberCoinsText = coins.split(",");
        int[] result = new int[numberCoinsText.length];

        for (int index = 0; index<numberCoinsText.length; index++){
            result[index]  = Integer.parseInt(numberCoinsText[index]);
        }
          return result;
    }
}
