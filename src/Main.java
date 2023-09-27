public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kilograms = 54;
        double meters = 1.69;
        int bmi = service.calculate(kilograms, meters);

        System.out.println("Индекс массы тела составляет: " + bmi);


    }

}
