/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/5 14:20
 * @Version 1.0
 */
public class Student<E> {
    private String name;
    private E score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E getScore() {
        return score;
    }

    public void setScore(E score) {
        this.score = score;
    }

    public Student(String name, E score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }
}
