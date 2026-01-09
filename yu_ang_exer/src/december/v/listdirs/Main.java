package december.v.listdirs;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static java.time.Instant.ofEpochMilli;

//列出系统所有盘符，并列出盘符下的一级目录或文件，如果是文件，显示文件的创建时间以及文件大小，如果是目录，以“<DIR>”做标识，形如
public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/sarni");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm");
        for(File f : file.listFiles()){
            if(!f.exists())
                break;

            System.out.print(dtf.format(LocalDateTime.ofInstant(ofEpochMilli(f.lastModified()), ZoneId.systemDefault())));

            if(f.isDirectory()){
                System.out.println("\t<DIR>\t"+ f.getName());
            }else
                System.out.println("\t" + f.length() + " Bytes\t\t" + f.getName());
        }
    }
}
