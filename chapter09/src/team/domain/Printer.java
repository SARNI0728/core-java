package team.domain;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/27 14:24
 * @Version 1.0
 */
public class Printer implements Equipment{
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Printer() {
    }

    @Override
    public String getDescription() {
        return String.format("%s(%s)",name,type);
    }
}
