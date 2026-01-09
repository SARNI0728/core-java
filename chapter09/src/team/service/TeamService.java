package team.service;

import team.domain.Architect;
import team.domain.Designer;
import team.domain.Employee;
import team.domain.Programmer;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/28 13:46
 * @Version 1.0
 */
public class TeamService {
    private static int counter = 1; //用于编号
    private final int MAX_MEMBER = 5; //最多成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0; //人数

    private final int MAX_ARCHITECT = 1;
    private final int MAX_DESIGNER = 2;
    private final int MAX_PROGRAMMER = 3;

    //包含所有成员对象的数组，数组大小与成员人数一致
    public Programmer[] getTeam() {
        Programmer[] newTeam = new Programmer[total];
        for (int i = 0, j = 0; i < MAX_MEMBER; i++) {
            if (team[i] == null)
                continue;
            newTeam[j++] = team[i];
        }
        return newTeam;
    }

    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER)
            throw new TeamException("The number of member has been fulled.");
        if (!(e instanceof Programmer))
            throw new TeamException("The member that u want add isn't developer.");
        if (((Programmer) e).getStatus() == Status.VOCATION)
            throw new TeamException("The member that u want add is taking a vocation.");

        int architectCount = 0;
        int designerCount = 0;
        int programmerCount = 0;

        for (int i = 0; i < team.length; i++) {
            //本for循环目的是获取整个团队中有几个架构师，设计师，程序员。
            //第二个任务是检查当前要添加的成员是否已经存在在团队中
            if (team[i] == null)
                continue;
            if (team[i] instanceof Architect)
                architectCount++;
            else if (team[i] instanceof Designer)
                designerCount++;
            else
                programmerCount++;

            if (team[i] == e)
                throw new TeamException("The member that u want add has existed in developer team.");
        }

        //获取当前要添加的成员职业
        if (e instanceof Architect && architectCount >= MAX_ARCHITECT)
            throw new TeamException("The number of architect has reached the Maximum.");
        else if (e instanceof Designer && designerCount >= MAX_DESIGNER) {
            throw new TeamException("The number of designer has reached the Maximum.");
        } else if (programmerCount >= MAX_PROGRAMMER)
            throw new TeamException("The number of programmer has reached the Maximum.");

        for (int i = 0; i < MAX_MEMBER; i++) { //找到team数组中可以存放的位置
            if (team[i] == null) {
                team[i] = (Programmer) e;
                ((Programmer) e).setMemberId(counter++);
                ((Programmer) e).setStatus(Status.BUSY);
                total++;
                break;
            }
        }
    }

    public void removeMember(int memberId) throws TeamException{
        for (int i = 0; i < MAX_MEMBER; i++) {
            if(team[i] != null && team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                team[i] = null;
                total--;
                return;
            }
        }
        throw new TeamException("Can't find the member through id: " + memberId + " ,delete failed.");
    }
}
