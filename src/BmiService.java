public class BmiService {
    public int calculate(double kilograms, double meters) {
        int  bmi;
        bmi = (int) (kilograms / Math.pow(meters, 2));
        return bmi;
    }


}
