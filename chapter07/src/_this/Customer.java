package _this;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/14 10:42
 * @Version 1.0
 */
public class Customer {
    public Customer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;
    private int age;
    private String tel;
    private String email;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Account account;
    public Customer(String f,String l){
        firstName = f;
        lastName = l;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account){
        this.account = account;
    }
}
