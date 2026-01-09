import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Description:
 * 用于生成每日作业的名字的提交
 *
 * @Author SArNi
 * @Create 2025/11/5 13:41
 * @Version 1.0
 */
public class FileNameGenerator {
    public static void main(String[] args) {
        //检测最后一次提交的文件夹对应的DAY
        File file = new File("/Users/sarni/JAVA学习/Java/每日作业");
        ArrayList<Integer> days = new ArrayList<>();
        for(File filePointer : file.listFiles()){
            int index = -1;
            if(filePointer.isDirectory() && filePointer.getName().contains("JAVASE")){
                index = filePointer.getName().lastIndexOf("DAY") + 3;
                days.add(Integer.parseInt(filePointer.getName().substring(index)));
            }
        }
        System.out.println("检测到当前文件夹最大的是 DAY" + Collections.max(days));


        int day = Collections.max(days) + 1; //用于保存最大的天数+1
        LocalDate date = LocalDate.now(); //产生今天的日期
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String fileName = date.format(formatter) + "_刘亚宁_JAVASE_DAY" + day;
        File newFile = new File("/Users/sarni/JAVA学习/Java/每日作业/" + fileName);
        if (newFile.mkdir()) {
            System.out.println(fileName + "文件夹已经创建好了！");
            System.out.println("存储在" + newFile.getAbsoluteFile());
        }
    }
}
