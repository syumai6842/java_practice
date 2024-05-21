import lib.NoisyCar;

public class J0004 {
    public static void main(String[] args) {
        NoisyCar mCar = new NoisyCar(3,1);
        mCar.Accelerate();
        mCar.honking();
        System.out.println(mCar.getCurrent_speed());
        
    }
}
