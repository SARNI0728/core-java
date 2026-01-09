package november.eleventh;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/11 16:48
 * @Version 1.0
 */
public class ClayToHumanFactor {
    public Person createPerson(String gender){
        if(gender.equals("男")){
            return new Man();
        }
        if(gender.equals("女")){
            return new Woman();
        }
        return null;
    }
}
