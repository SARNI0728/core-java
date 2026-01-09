package december.ii.score;

import java.util.List;
import java.util.stream.Stream;

/*统计每名学生的总成绩和平均成绩
        统计指定学科的总成绩和平均成绩
统计挂科人数
将所有不及格分数提升10%，再次统计挂科人数
        显示所有学生的成绩表*/
public class Main {
    public static void main(String[] args) {
        Student p1 =  new Student("李白",98,60,70,95);
        Student p2 = new Student("杜甫",98,85,80,90);
        Student p3 = new Student("白居易",95,55,85,80);
        Student p4 = new Student("李商隐",90,58,50,70);
        Stream.of(p1,p2,p3,p4).map(student -> //统计每个学生的总成绩和平均成绩
                "学生" + student.getName() + "的总成绩为：" + student.getTotalScore() + "平均分为：" + student.getTotalScore() / 4
        ).forEach(System.out::println);

        //统计指定学科的总成绩还有平均成绩
        double mathTotalScore = Stream.of(p1, p2, p3, p4).mapToDouble(Student::getMathScore).sum();
        System.out.println("数学总分：" +  mathTotalScore + "数学平均分：" + mathTotalScore / 4);

        double englishTotalScore = Stream.of(p1, p2, p3, p4).mapToDouble(Student::getEnglishScore).sum();
        System.out.println("英语总分：" +  englishTotalScore + "英语平均分：" + englishTotalScore / 4);

        double chineseTotalScore = Stream.of(p1, p2, p3, p4).mapToDouble(Student::getChineseScore).sum();
        System.out.println("语文总分：" +  chineseTotalScore + "语文平均分：" + chineseTotalScore / 4);

        double geographyTotalScore = Stream.of(p1, p2, p3, p4).mapToDouble(Student::getGeographyScore).sum();
        System.out.println("地理总分：" +  geographyTotalScore + "地理平均分：" + geographyTotalScore / 4);

        //统计挂科人数
        int filedStudentNumber = (int)Stream.of(p1, p2, p3, p4).filter(
                student -> student.getMathScore() < 60 || student.getEnglishScore() < 60
                || student.getChineseScore() < 60 || student.getGeographyScore() < 60
        ).count();
        System.out.println("挂科人数：" + filedStudentNumber);

        //将不及格的学生所有成绩提高 10%再统计挂科的人数
        Stream.of(p1, p2, p3, p4).filter(
                student -> student.getMathScore() < 60 || student.getEnglishScore() < 60
                        || student.getChineseScore() < 60 || student.getGeographyScore() < 60
        ).forEach(student -> {
            student.setMathScore(student.getMathScore() * 1.1);
            student.setEnglishScore(student.getEnglishScore() * 1.1);
            student.setGeographyScore(student.getGeographyScore() * 1.1);
            student.setChineseScore(student.getChineseScore() * 1.1);
        });

        //统计挂科人数
        filedStudentNumber = (int)Stream.of(p1, p2, p3, p4).filter(
                student -> student.getMathScore() < 60 || student.getEnglishScore() < 60
                        || student.getChineseScore() < 60 || student.getGeographyScore() < 60
        ).count();

        System.out.println("挂科人数：" + filedStudentNumber);

        //显示所有学生成绩表
        for(Student student : List.of(p1,p2,p3,p4)) {
            System.out.println(student);
        }
    }
}
