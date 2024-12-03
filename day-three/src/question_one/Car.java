package question_one;

import static java.lang.Integer.parseInt;

public class Car {
    String id;
    int fuelLevel;
    int units;
    int speedLimit;
    boolean engineRunning;

    public Car(String id, int fuelLevel, int units, int speedLimit, boolean engineRunning) {
        this.id = id;
        this.fuelLevel = fuelLevel;
        this.units = units;
        this.speedLimit = speedLimit;
        this.engineRunning = engineRunning;
    }

    public void findMyCar(String id) throws CarNotFound {


        if ((id.isEmpty() || id == null)) {
            throw new CarNotFound("have entered an invalid id");
        }

        if (!id.equals(this.id)) {
            throw new CarNotFound("Car with the specified ID is not present.");
        } else {
            System.out.println(id);
        }


    }

    public void drive(int fuelLevel) throws LowFuelException {
        if (fuelLevel < this.fuelLevel) {
            throw new LowFuelException("you cant drive this amount of fuel");
        } else {
            System.out.println("drive");
        }

    }

    public void accelerate(int speedLimit) throws SpeedLimitException {
        if (speedLimit > this.speedLimit) {
            throw new SpeedLimitException("you have exeeded the speed limit");
        }
    }

    public void isUnitAvailable(int units) throws UnitExceededException {
        if (units > this.units) {
            throw new UnitExceededException("unit level is not acceptable");

        }
    }

    public void engineWrokingOrNot(Boolean engineRunning) throws EngineFaliureException {
        if (!engineRunning == this.engineRunning) {
            throw new EngineFaliureException("engine is not working");
        }
    }

}