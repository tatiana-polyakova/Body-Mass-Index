public class Main {
    public static void main(String[] args) {
            BmiService service = new BmiService();
               float bmi = service.calculate (88,167);
        System.out.println(bmi);
    }
}
