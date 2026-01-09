package team.domain;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/27 14:21
 * @Version 1.0
 */
public class PC implements Equipment{
    private String model;
    private String  display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return String.format("%s(%s)",model,display);
    }
}
