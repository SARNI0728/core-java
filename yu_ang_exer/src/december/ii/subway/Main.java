package december.ii.subway;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> stations = new LinkedList<>(
                List.of("大学城","华苑","王顶堤","红旗南路","周邓纪念馆","天塔", "吴哥窟","西康路","营口道","小白楼")
        );
        BiFunction<String,String,Integer> f =  (start,dest) ->  abs(stations.indexOf(start) - stations.indexOf(dest));
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入始发站");
        String start = scanner.nextLine();
        System.out.println("输入终点站");
        String dest = scanner.nextLine();
        print_cost(f,start,dest);
    }

    public static void print_cost(BiFunction<String,String,Integer> f,String start,String dest){
        int diff = f.apply(start,dest);
        if(diff <= 3)
            System.out.println("本次收费2元。");
        else if(diff <= 5)
            System.out.println("本次收费3元。");
        else if(diff <= 7)
            System.out.println("本次收费4元。");
        else System.out.println("本次收费5元。");
    }
}
