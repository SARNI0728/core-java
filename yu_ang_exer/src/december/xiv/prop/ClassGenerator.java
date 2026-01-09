package december.xiv.prop;

import java.io.*;
import java.util.Properties;

/// 在config.properties文件中，配置要生成的类名、属性名和属性类型，使用IO流，生成一个.java源文件，
/// 包括包名、类名、属性、无参构造方法、全参构造方法、getter and setter方法、toString方法
/// properties文件形如：
/// class.name=com.coder.test.Student
/// property.names=name,age,gender
/// property.types=String,int,String
public class ClassGenerator { //根据properties文件生成Class文件
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        String propFilePath = "/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/xiv/prop/config.properties";
        FileInputStream fis = new FileInputStream(propFilePath);
        prop.load(fis);
        fis.close();
        System.out.println(prop);

        //创建文件
        String newClassPath = "/Users/sarni/JAVA学习/javacode/javacode/JavaSECode/yu_ang_exer/src/december/xiv/prop";
        int index = prop.getProperty("class.name").lastIndexOf(".");
        String className = prop.getProperty("class.name").substring(index+1);
        File file = new File(newClassPath,className + ".java");

        if(file.createNewFile()) System.out.println("文件创建成功");

        //开始把代码全部写到sb中，为下一步输出做好准备
        String rawAttributes = prop.getProperty("property.names");
        String[] Attributes = rawAttributes.split(","); //获取属性

        String rawTypes = prop.getProperty("property.types");
        String[] Types = rawTypes.split(","); //获取属性对应的类型


        StringBuilder sb = new StringBuilder("package " + prop.getProperty("class.name").substring(0,index) + ";\n\n");
        sb.append("public class " + className + " {\n");
        for (int i = 0; i < Attributes.length; i++) {
            sb.append("\tprivate "+Types[i] + " " + Attributes[i] +";\n");
        } //描绘属性


        sb.append("\n\tpublic " + className + "() {\n\t}\n"); //空参构造器
        sb.append("\n");
        sb.append("\tpublic " + className + "(");
        for (int i = 0; i < Attributes.length; i++) {
            sb.append( Types[i] + " " + Attributes[i]);
            if(i != Attributes.length-1) sb.append(",");
        }
        sb.append(") {\n");
        for (int i = 0; i < Types.length; i++) {
            sb.append("\t\tthis." + Attributes[i] + " = " + Attributes[i] + ";\n");
        }
        sb.append("\t}\n");


        for (int i = 0; i < Types.length; i++) {
            sb.append("\tpublic " + Types[i] + " get" + Attributes[i].substring(0,1).toUpperCase() + Attributes[i].substring(1) + "() {\n");
            sb.append("\t\treturn " + Attributes[i] + ";\n\t}\n");
        } //生成所有get方法

        for (int i = 0; i < Types.length; i++) {
            sb.append("\tpublic void set" + Attributes[i].substring(0,1).toUpperCase() + Attributes[i].substring(1) + "(" + Types[i] + " " + Attributes[i] + "){\n");
            sb.append("\t\tthis." + Attributes[i] + " = " + Attributes[i] + ";\n\t}\n");
        } //生成所有set方法

        sb.append("\n\t@Override\n");
        sb.append("\tpublic String toString() {\n");
        sb.append("\t\treturn \"" + className + "{\" +\n");
        for (int i = 0; i < Types.length; i++) {
            sb.append("\t\t\t\"" + Attributes[i] + " =\" + " + Attributes[i] + "+\"\\t\" +\n");
        }
        sb.append("\t\t\t\"}\";");
        sb.append("\n\t}");
        sb.append("\n}");

        System.out.println(sb);
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(file))){
            pw.write(sb.toString());
        }
    }
}
