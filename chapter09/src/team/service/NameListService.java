package team.service;

import team.domain.*;

import static team.view.Data.*;

/**
 * Description:
 *  功能：负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 * @Author SArNi
 * @Create 2025/10/27 14:58
 * @Version 1.0
 */
public class NameListService {
    //3. JAVA数组这里的问题，当我完成语句15时，看似我是完成了声明，实际上只声明了一个指针
    private Employee[] employees;
    public Employee[] getAllEmployees (){
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("ERROR: Can't find the member through id:" + id);
    }

    public NameListService() {
        //3. 在这里一个数组才构建好了，也就是说在往数组里面new东西之前，必须要告诉编译器这个数组有多大
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < EMPLOYEES.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment e = null;
            String model;

            if(EQUIPMENTS[i].length > 0){
                int deviceType = Integer.parseInt(EQUIPMENTS[i][0]);
                switch (deviceType){
                    case PC:
                        model = EQUIPMENTS[i][1];
                        String display = EQUIPMENTS[i][2];
                        e = new PC(model,display);
                        break;
                    case NOTEBOOK:
                        model = EQUIPMENTS[i][1];
                        double price = Double.parseDouble(EQUIPMENTS[i][2]);
                        e = new NoteBook(model,price);
                        break;
                    case PRINTER:
                        model = EQUIPMENTS[i][1];
                        String printer_type = EQUIPMENTS[i][2];
                        e = new Printer(model,printer_type);
                        break;
                }
            }

            if(type == EMPLOYEE){
                employees[i] = new Employee(id,name,age,salary);
            }else if(type == PROGRAMMER){
                employees[i] = new Programmer(id,name,age,salary,e);
            }else if(type == DESIGNER){
                double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                employees[i] = new Designer(id,name,age,salary,e,bonus);
            }else if(type == ARCHITECT){
                double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                int stock = Integer.parseInt(EMPLOYEES[i][6]);
                employees[i] = new Architect(id,name,age,salary,e,bonus,stock);
            }
        }
    }
}
