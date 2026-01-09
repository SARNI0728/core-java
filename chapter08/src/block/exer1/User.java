package block.exer1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/9/28 14:12
 * @Version 1.0
 */
public class User {
    String username;
    String password;
    private long registrationTime;
    User(){
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        username = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    User(String username,String password){
        this();
        this.username = username;
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
