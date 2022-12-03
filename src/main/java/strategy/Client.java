package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Client {
    private static int count = 0;
    private final int id;
    private String name;
    private String email;
    private int age;
    private String sex;

    public Client(String name, String email, int age, String sex) {
        id = ++count;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
    }
}
