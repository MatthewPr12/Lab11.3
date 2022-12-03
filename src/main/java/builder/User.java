package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder()
                .age(31)
                .name("Oles")
                .occupation("UCU")
                .build();
        System.out.println(user);
    }
}
