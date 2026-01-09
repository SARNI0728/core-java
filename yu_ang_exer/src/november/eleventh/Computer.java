package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 16:28
 * @Version 1.0
 */
public class Computer {
    String model;
    GraphicsCard g;

    public Computer() {
    }

    public Computer(String model, boolean isIndependent, int videoMemory) {
        this.model = model;
        g = new GraphicsCard(isIndependent, videoMemory);
    }
}