public class MyServiceTest {

    static boolean methodCalled = false;

    public static void main(String[] args) {

        ExternalApi mockApi = new ExternalApi() {

            @Override
            public String getData() {
                methodCalled = true;
                return "Mock Data";
            }
        };

        MyService service = new MyService(mockApi);

        service.fetchData();

        if(methodCalled) {
            System.out.println("Verification Passed");
            System.out.println("getData() method was called.");
        } else {
            System.out.println("Verification Failed");
        }
    }
}