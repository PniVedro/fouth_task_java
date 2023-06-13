public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        int indexMassBody = (int) service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + indexMassBody);
    }
}