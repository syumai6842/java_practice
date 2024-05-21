package lib;

public class Car {
    private int acceleration;
    private int friction;
    private int current_speed = 0;

    public Car(int acceleration, int friction){
        this.acceleration = acceleration;
        this.friction = friction;
        System.out.println("Car instance has been initialized!!");
    }

    public int getCurrent_speed() {
        return current_speed;
    }

    public void Accelerate(){
        current_speed += acceleration;
        System.out.println("speed is "+current_speed);
    }

    public void Brake(){
        current_speed -= friction;
        System.out.println("speed is "+current_speed);
    }
}