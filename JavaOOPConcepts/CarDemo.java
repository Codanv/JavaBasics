
interface Cart {
    int wheels = 2; // public final static int wheels = 2;

    void info(); // public abstract void info();
}

interface CartZ {
    void roof();
}

abstract class Vehicle implements Cart {
    private int year;

    public Vehicle() {
        this.year = 1900;
    }

    public Vehicle(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // public void roof() {
    // System.out.println("Roof...");
    // }

    abstract public void move();
}

class Car extends Vehicle implements CartZ {
    private static final int MAXSPEED = 120;
    private int speed;

    // constructors
    // non-parametrized
    public Car() {
        super();
        this.speed = 0;
    }

    // parametrized
    public Car(int speed, int year) {
        super(year);
        this.speed = speed;
    }

    // getter
    public int getMAXSPEED() {
        return Car.MAXSPEED;
    }

    public int getSpeed() {
        return this.speed;
    }

    // setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static void message() {
        System.out.println("Hello Pessangers!");
    }

    public void accelerate() {
        if (this.speed > MAXSPEED)
            this.speed = MAXSPEED;
        else
            this.speed = speed + 5;
    }

    public void accelerate(int speed) {
        if (this.speed > MAXSPEED)
            this.speed = MAXSPEED;
        else
            this.speed += speed;
    }

    public void decelerate() {
        if (this.speed < 5)
            this.speed = 0;
        else
            this.speed -= 5;
    }

    public void decelerate(int speed) {
        if (this.speed < 5)
            this.speed = 0;
        else
            this.speed -= speed;
    }

    public void brake() {
        this.speed = 0;
    }

    public void brake(int speed) {
        this.decelerate(speed);
    }

    public void move() {
        System.out.println("Moving...");
    }

    public void info() {
        System.out.println("Hello.....");
    }

    public void roof() {
        System.out.println("Roof...");
    }

}

class CarZ extends Car {

    private boolean engineStatus;
    private int gear;

    public CarZ() {
        super();
        this.engineStatus = false;
        this.gear = 1;
    }

    public CarZ(int speed, boolean engineStatus, int gear, int year) {
        super(speed, year);
        this.engineStatus = engineStatus;
        this.gear = gear;
    }

    // getter
    public boolean getEngineStatus() {
        return this.engineStatus;
    }

    public int getGear() {
        return this.gear;
    }

    // setter
    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void accelerate() {
        if (this.engineStatus == true) {
            super.accelerate();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void accelerate(int speed) {
        if (this.engineStatus == true) {
            super.accelerate(speed);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void decelerate() {
        if (this.getEngineStatus() == true) {
            super.decelerate();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void decelerate(int speed) {
        if (this.getEngineStatus() == true) {
            super.decelerate(speed);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void brake(int speed) {
        if (this.engineStatus == true)
            super.brake(speed);
        else
            throw new IllegalArgumentException();
    }

    public void move(String side) {
        System.out.println("Moving " + side + "...");
    }
}

class CarDemo {
    public static void main(String arguments[]) {

        // Car.message();
        // System.out.println(Car.MAXSPEED);

        // Car car1 = new Car();
        // Car car2 = new Car(10);

        // car2.brake();

        // System.out.println("Current Speed car2 : " + car2.getSpeed());
        // System.out.println("Current Speed car1 : " + car1.getSpeed());

        // CarZ.message();

        // CarZ cz = new CarZ(25, false, 2);

        // cz.setEngineStatus(true);
        // cz.accelerate();
        // cz.accelerate(25);
        // cz.decelerate();
        // cz.decelerate(10);
        // cz.setGear(2);
        // cz.brake(2);

        // System.out.println(cz.getSpeed());
        // System.out.println(cz.getGear());
        // System.out.println(cz.getEngineStatus());

        CarZ c1 = new CarZ(20, true, 1, 2020);

        // System.out.println(c1.getYear());
        // c1.move();
        // c1.move("Left");

        c1.info();

        // System.out.println(Cart.wheels);
        // System.out.println(Vehicle.wheels);
        // System.out.println(Car.wheels);
        // System.out.println(CarZ.wheels);

        c1.roof();

    }
}