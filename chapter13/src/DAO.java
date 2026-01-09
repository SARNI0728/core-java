import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Description:
 *
 * @Author SArNi
 * @Create 2025/11/4 20:44
 * @Version 1.0
 */
public class DAO <T>{ //定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。
    HashMap<String,T> map = new HashMap<>();
    public void save(String id,T entity){ //public void save(String id,T entity)： 保存 T 类型的对象到 Map 成员变量中
        map.put(id,entity);
    }
    public T get(String id){ //从 map 中获取 id 对应的对象
        return map.get(id); //找到key为id的对象
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){ //返回 map 中存放的所有 T 对象
        return new ArrayList<>(map.values());
    }
    public void delete(String id){
        map.remove(id);
    }
}
