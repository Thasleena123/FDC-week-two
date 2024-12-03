package question_three;

public class DateException extends Exception {
    public DateException(String message) {
        super(message);
    }
}

class InvalidDateException extends DateException {
    public InvalidDateException(String message) {
        super(message);
    }
}

class InvalidMonthException extends DateException {
    public InvalidMonthException(String message) {
        super(message);
    }
}
class InvalidYearException extends DateException{
    InvalidYearException(String message) {
        super(message);
    }
}