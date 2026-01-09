/**
 * Description:
 * 案例：百天推算
 * 使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
 * 使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
 * @Author SArNi
 * @Create 2025/11/1 16:48
 * @Version 1.0
 */
//public class Exer2 {
//    @Test
//    public void LocalDateTimeTest(){
//        LocalDateTime t = LocalDateTime.now();
//        System.out.println(t);
//        t = LocalDateTime.of(2001,7,28,14,10);
//        System.out.println(t);
//        LocalDateTime nt = t.plusDays(100);
//        System.out.println(nt);
//    }
//
//    @Test
//    public void CalenderTest(){
//        Calendar c = Calendar.getInstance();
//        System.out.println(c);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH);
//        int day = c.get(Calendar.DAY_OF_MONTH);
//        System.out.println("Year:" + year + "\tMonth:" + month + "\tDay:" + day);
//        c.set(Calendar.YEAR,2001);
//        c.set(Calendar.MONTH,6);
//        c.set(Calendar.DAY_OF_MONTH,28);
//        year = c.get(Calendar.YEAR);
//        month = c.get(Calendar.MONTH);
//        day = c.get(Calendar.DAY_OF_MONTH);
//        System.out.println("Year:" + year + "\tMonth:" + month + "\t\tDay:" + day);
//        c.add(Calendar.DAY_OF_MONTH,100);
//        year = c.get(Calendar.YEAR);
//        month = c.get(Calendar.MONTH);
//        day = c.get(Calendar.DAY_OF_MONTH);
//        System.out.println("Year:" + year + "\tMonth:" + month + "\tDay:" + day);
//    }
//}
