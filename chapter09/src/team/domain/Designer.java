package team.domain;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/27 14:41
 * @Version 1.0
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getBaseInfo() + "\t\tDESIGNER\t\t\t" + getStatus().toString() + "\t" + bonus
                + "\t\t\t"+ getEquipment().getDescription();
    }

    public String getDetailsForTeam(){
        return getBaseInfoForTeam() + "\tDESIGNER\t" + getBonus();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
