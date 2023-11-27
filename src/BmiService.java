public class BmiService {
    public double calculate(int weight, double height) {
        double height2 = Math.pow(height, 2);
        double BMI = weight / height2;
        return (int) BMI;
    }
}
