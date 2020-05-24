public class BmiService {
    public float calculate(int weight, int height) {
        float bmi = weight / (height * height / 100f / 100);
        return bmi;
    }
}
