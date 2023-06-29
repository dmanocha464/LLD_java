package Builder.v2;

import lombok.Builder;
import lombok.Getter;
//using lombok builder implementation
@Getter
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Integer age;
    private Double experience;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
