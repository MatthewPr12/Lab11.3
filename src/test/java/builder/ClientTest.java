package builder;

import junit.framework.TestCase;


public class ClientTest extends TestCase {


    public void setUp() throws Exception {
        super.setUp();

    }

    public void testBuilder() {
        boolean success;
        try {
            Client client = Client.builder().email("bob@gmail.com").name("Ravlyk Bob").age(12).build();
            Client ravlyk = Client.builder().email("bob@gmail.com").name("Ravlyk Bob").age(12).build();
            success = true;
        }catch (Exception e){
            System.out.println(e);
            success=false;
        }
        assert success==true;
    }
}