import java.util.HashMap;

public class Request {
    HashMap<String, String> params = new HashMap();
    public void addParameter(String name, String value) {
        params.put(name, value);
    }
    public String getParameter(String name){
        return params.get(name);
    }
}
