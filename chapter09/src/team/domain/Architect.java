package team.domain;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/27 14:42
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String toString() {
        return getBaseInfo() + "\t\tARCHITECT\t\t\t" + getStatus().toString() + "\t" + getBonus() + "\t"
                + stock + "\t"
                + getEquipment().getDescription();
    }

    public String getDetailsForTeam(){
        return getBaseInfoForTeam() + "\tARCHITECT\t" + getBonus() + "\t" + getStock();
    }
}
