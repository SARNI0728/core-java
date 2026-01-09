package team.domain;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/27 14:07
 * @Version 1.0
 */
public class NoteBook implements Equipment{
    private String model;
    private double price;
    public NoteBook(){
    }
    public NoteBook(String model,double price){
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //Q1. 写这种字符串的时候只能是先写个字符串左，然后再写个字符串右吗？
    public String getDescription(){
        //A1.改进方法在此
        return String.format("%s(%.2f)", model, price);
    }
}
