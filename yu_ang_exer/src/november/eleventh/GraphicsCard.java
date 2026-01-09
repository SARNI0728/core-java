package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 16:23
 * @Version 1.0
 */
public class GraphicsCard {
    boolean IsIndependent; //是否为独立显卡
    int VideoMemory; //显存 单位为g

    public GraphicsCard(boolean isIndependent, int videoMemory) {
        IsIndependent = isIndependent;
        VideoMemory = videoMemory;
    }
}