package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 16:09
 * @Version 1.0
 */
public class Player {
    String name;
    Computer c;

    public Player(String name,String model, boolean isIndependent, int videoMemory) {
        this.name = name;
        c = new Computer(model,isIndependent,videoMemory);
    }

    public boolean checkLOLIsReady(Player p){
        if(p.c.g.VideoMemory >=4 && p.c.g.IsIndependent){
            return true;
        }
        return false;
    }
}
