import lib.Car;

public class J0004 {
    public static void main(String[] args) {
        Car mCar = new Car(3,1);
        mCar.Accelerate();
        System.out.println(mCar.getCurrent_speed());
        
    }
}
