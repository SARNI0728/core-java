package team.junit;

import org.junit.Test;
import team.domain.Employee;
import team.service.NameListService;
import team.service.TeamException;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/10/27 17:23
 * @Version 1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService n = new NameListService();
        Employee[] employees = n.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        int choice = 2;
        NameListService n = new NameListService();
        try{
            Employee e;
            e = n.getEmployee(choice);
            System.out.println(e);
        }catch (TeamException e){
            e.printStackTrace();
        }
    }

}
