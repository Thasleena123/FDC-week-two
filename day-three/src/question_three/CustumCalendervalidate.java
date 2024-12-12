public class CustumCalendervalidate {
    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

   public void validateDate(int day,int month,int year) throws InvalidDateException, InvalidMonthException, InvalidYearException {
//       if(day>31|| day<1){
//           throw new InvalidDateException("this is not a valid day");
//       }
       if(month>12||month<1){
           throw  new InvalidMonthException("it is not a valid month");
       }
       if(year<0){
           throw new InvalidYearException("it is not a valid year");
       }

 if (month == 2) {
        if (isLeapYear(year)) {
            if (day < 1 || day > 29) {
                throw new InvalidDateException("February " + year + " has only 29 days.");
            }
        } else {
            if (day < 1 || day > 28) {
                throw new InvalidDateException("February " + year + " has only 28 days.");
            }
        }
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        if (day < 1 || day > 30) {
            throw new InvalidDateException("This month has only 30 days.");
        }
    } else {
        if (day < 1 || day > 31) {
            throw new InvalidDateException("This month has only 31 days.");
        }
    }
}
}
