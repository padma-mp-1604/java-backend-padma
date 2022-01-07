package factory;

public class AbcCoin implements CoinProvider {

    public float currentPrice()
    {
        return 10.26f;
    }

    public String coinName()
    {
        return "abc";
    }
}
