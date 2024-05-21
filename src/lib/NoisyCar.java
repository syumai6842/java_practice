package lib;

public class NoisyCar extends Car {

    public NoisyCar(int acceleration, int friction) {
        super(acceleration, friction);
    }

    public void honking(){
        System.out.println("クラクションです!!!!!");
    }

    @Override
    public void Accelerate(){
        current_speed += this.acceleration * 2;
        System.out.println("speed is "+current_speed);
    }

    public void Accelerate(int acceleration){
        current_speed += acceleration;
        System.out.println("speed is "+current_speed);
    }

}
