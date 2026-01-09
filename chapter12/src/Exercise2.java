import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/3 16:02
 * @Version 1.0
 */
public class Exercise2 {
    public static void main(String[] args) {
        List l = new ArrayList();
        StringBuilder str = new StringBuilder(30);
        for (int i = 0; i < 30; i++) {
            Character randomCharacter = (char)(new Random().nextInt(26) + 97);
            l.add(randomCharacter);
            str.append(randomCharacter);
        }
        System.out.println(l);
        listTest(l);
    }

    public static void listTest(Collection list){
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countX = 0;
        Character c = 0;
        for(Object obj : list){
            if(obj instanceof Character) {
                 c = (Character)obj;
            }

            switch (c){
                case 'a':
                    countA++;
                    break;
                case 'b':
                    countB++;
                    break;
                case 'c':
                    countC++;
                    break;
                case 'x':
                    countX++;
                    break;
            }
        }
        System.out.println("a:" + countA);
        System.out.println("b:" + countB);
        System.out.println("c:" + countC);
        System.out.println("x:" + countX);
    }
}
