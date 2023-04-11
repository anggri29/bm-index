public class BmiService {
    public int calculate(int m, double h) {

        double BMI;
        if (m > 0) {
            BMI = m / (h * h);
        } else {
            BMI = 0;
        }
        return (int) BMI;
    }

}