package question_three;

public class ExecutableQuestionThree {
    public static void main(String[] args) {
        try {
            CustumCalendervalidate custumCalendervalidate = new CustumCalendervalidate();
            custumCalendervalidate.validateDate(90, 12, 8987);


        } catch (InvalidMonthException im) {
            System.out.println(im.getMessage());

        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        } catch (InvalidYearException ey) {
            System.out.println(ey.getMessage());
        }

    }

}



