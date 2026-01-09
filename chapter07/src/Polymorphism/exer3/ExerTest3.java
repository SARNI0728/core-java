package Polymorphism.exer3;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/27 15:22
 * @Version 1.0
 */
public class ExerTest3 {
    public static void meeting(Person... ps){
        for(int i = 0; i<ps.length;i++){
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man)
                ((Man) ps[i]).smoke();
            else if(ps[i] instanceof Woman)
                ((Woman)ps[i]).makeup();
        }
    }

    public static void main(String[] args) {
        Man p1 = new Man();
        Man p2 = new Man();
        Man p3 = new Man();
        Woman p4 = new Woman();
        Woman p5 = new Woman();
        Woman p6 = new Woman();
        meeting(p1,p2,p3,p4,p5,p6);
    }
}
