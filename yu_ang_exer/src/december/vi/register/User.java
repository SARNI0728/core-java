package december.vi.register;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private final static long serialVersionUID=1237891273891983791L;
    String id;
    String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
