package _enum;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/18 18:48
 * @Version 1.0
 */
public enum Color {
    RED(255,0,0,"红色"),
    ORANGE(255,128,0,"橙色"),
    YELLOW(255,255,0,"黄色"),
    GREEN(0,255,0,"绿色"),
    CYAN(0,255,255,"青色"),
    BLUE(0,0,255,"蓝色"),
    PURPLE(128,0,255,"紫色");
    Color(int red,int green,int blue,String description){
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }
    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    public String toString(){
        return super.toString();
    }
}
