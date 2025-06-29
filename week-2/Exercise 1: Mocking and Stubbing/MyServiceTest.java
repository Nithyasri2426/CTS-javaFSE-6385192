import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create a mock object for the external API
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the getData method to return a predefined value
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Use the mock in MyService
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assertion to verify the result
        assertEquals("Mock Data", result);
    }
}
