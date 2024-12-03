package question_one;

public class CarExceptionMain {
    public static void main(String[] args) {
        Car car = new Car("RR0356", 5, 10, 80, true);

        try {

            car.findMyCar("RR0356");
        } catch (CarNotFound cnp) {
            System.out.println(cnp.getMessage());
        }try {
            car.accelerate(70);
        } catch (SpeedLimitException sl) {
            System.out.println(sl.getMessage());
        }try {
            car.engineWrokingOrNot(false);
        } catch (EngineFaliureException ef) {
            System.out.println(ef.getMessage());
        }try{
            car.isUnitAvailable(1);
        } catch (UnitExceededException ue) {
            System.out.println(ue.getMessage());
        }try{
            car.drive(6);
        }catch (LowFuelException lf){
            lf.getMessage();
        }






    }
}