public class Main {
    public static void main(String[] args) {
        // ИМТ = m/h2, где: m — масса тела в килограммах,; h — рост в метрах
        BmiService service = new BmiService();
        int m = 57;
        double h = 1.62;
        double BMI = service.calculate (57, 1.62);
        System.out.println("Индекс массы тела: " + BMI);
    }
}