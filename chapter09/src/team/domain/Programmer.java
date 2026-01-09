package team.domain;

import team.service.Status;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/27 14:34
 * @Version 1.0
 */
public class Programmer extends Employee{
    private int memberId;
    //2. enum有点忘了
    private Status status = Status.FREE;

    private Equipment equipment;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer() {
    }


    @Override
    public String toString() {
        return getBaseInfo() + "\t\tPROGRAMMER\t"  + "\t\t" + status.toString() + "\t\t\t\t\t"
                + equipment.getDescription();
    }
    public String getDetailsForTeam(){
        return getBaseInfoForTeam() + "\tPROGRAMMER\t";
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    protected String getBaseInfoForTeam(){
        return  memberId +"/"+ getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }
}
