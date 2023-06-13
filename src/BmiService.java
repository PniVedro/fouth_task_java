public class BmiService {
    public float calculate(int weightKg, double heightMeters) {
        return (float) (weightKg / (heightMeters * heightMeters));
    }
}
// ИМН масса деленная на рост в квадрате, рост в метрах