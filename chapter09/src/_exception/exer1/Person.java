package _exception.exer1;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/25 10:52
 * @Version 1.0
 */
public class Person {
    private String name;
    private int HP;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHP(int HP){
        if(HP < 0){
            throw new NoLifeValueException("生命值不能为负数！");
        }
        this.HP = HP;
    }

    public Person() {
    }

    public Person(String name, int HP) {
        setHP(HP);
        setName(name);
    }
    public String toString(){
        return "Name : " + name + "\nHP : " + HP;
    }
}
