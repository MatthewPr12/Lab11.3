package builder;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Client extends User {
    public static void main(String[] args) {
        Client client = Client.builder().email("dovosevych@ucu.edu.ua").build();
        System.out.println(client);
    }
}
