package lab3;

public class Spaceship {
    private int speed;
    public Spaceship(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }
}