package tostring;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/27 20:22
 * @Version 1.0
 */
public class GrometricObject {
    protected String color;
    protected double weight;

    public GrometricObject() {
    }

    public GrometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
