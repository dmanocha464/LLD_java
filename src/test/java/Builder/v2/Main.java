package Builder.v2;

public class Main {
    public static void main(String[] args) {
        try{
            Student student = Student.builder()
                    .email("@xyz.com")
                    .phoneNumber("98765")
                    .firstName("abc")
                    .lastName("xyz")
                    .build();
            System.out.println(student.toString());
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
