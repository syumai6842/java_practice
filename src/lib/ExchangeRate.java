package lib;

public class ExchangeRate {
    static private float JPY = 150;
    static private float KRW = 1365;

    public static int ExchangeJPYtoKRW(int yen){
        return (int) (yen * (KRW / JPY));
    }
    public static int ExchangeKRWtoJPY(int won){
        return (int) (won * (JPY / KRW));
    }
}
