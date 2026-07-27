public class MyServiceTest {

    public static void main(String[] args) {

        // Mock Object (Manual Mock)
        ExternalApi mockApi = new ExternalApi() {
            @Override
            public String getData() {
                return "Mock Data";
            }
        };

        // Inject mock into service
        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        if(result.equals("Mock Data")) {
            System.out.println("Test Passed");
            System.out.println("Returned Value: " + result);
        } else {
            System.out.println("Test Failed");
        }
    }
}