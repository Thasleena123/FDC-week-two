package question_one;

public class CarException extends Exception {

    public CarException(String message) {
        super(message);
    }
}

class CarNotFound extends CarException {

    public CarNotFound(String message) {
        super(message);
    }
}


 class LowFuelException extends CarException {

    public LowFuelException(String message) {
        super(message);
    }
}

class SpeedLimitException extends CarException {

    public SpeedLimitException(String message) {
        super(message);
    }
}

class UnitExceededException extends CarException {

    public UnitExceededException(String message) {
        super(message);
    }
}
class EngineFaliureException extends CarException {

    public EngineFaliureException(String message) {
        super(message);
    }
}