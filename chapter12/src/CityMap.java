import java.util.*;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 12:49
 * @Version 1.0
 */
class CityMap{

    public static Map model = new HashMap();

    static {
        model.put("北京", new String[] {"北京"});
        model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
        model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
        model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
        model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
        model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
    }

    public static void main(String[] args) {
        Set entrySet = model.keySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
        System.out.println("\n选择你所在的省份：");
        Scanner s = new Scanner(System.in);

        while(true){
            String userChoseProvince = s.nextLine();
            if(model.get(userChoseProvince) == null){
                System.out.println("没有上述省份，重新输入");
                continue;
            }
            String[] str = (String[]) model.get(userChoseProvince);
            for(String tempString : str){
                System.out.print(tempString + "\t");
            }
            System.out.println("选择你所在的地级市：");

            String userChoseCity = s.nextLine();

            for(String tempString : str){
                if(userChoseCity.equals(tempString)){
                    System.out.println("信息登记完毕。");
                    System.exit(0);
                }
            }
            System.out.println("信息不正确，重新输入你所在的省份。");
        }


    }
}