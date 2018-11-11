import com.main.TestWebService;
import com.main.TestWebServiceService;

public class TestV {
    public static void main(String[] args) {
        TestWebService a = new TestWebServiceService().getTestWebServicePort();
        String name = a.getNameV("你爸爸");
        System.out.println(name);
    }
}
