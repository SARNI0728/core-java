package object;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/27 17:05
 * @Version 1.0
 */
public class MyDate {
    int year;
    int month;
    int day;
    public MyDate() {
    }
    public MyDate(int month, int day,int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o instanceof MyDate)
            return (this.year == ((MyDate) o).year)&&
                    (this.month == ((MyDate) o).month)&&
                    (this.day == ((MyDate) o).day);
        return false;
    }
}
