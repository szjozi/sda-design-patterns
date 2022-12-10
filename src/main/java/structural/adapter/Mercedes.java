package structural.adapter;


public class Mercedes implements Movable {

    private double speed;

    @Override
    public double getKmSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
