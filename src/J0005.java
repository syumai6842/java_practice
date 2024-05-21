import lib.NoisyCar;

public class J0005 {
    public static void main(String[] args) {
        NoisyCar mCar = new NoisyCar(3,1);
        mCar.Accelerate(100);
        mCar.honking();
        System.out.println(mCar.getCurrent_speed());
        
    }
}
