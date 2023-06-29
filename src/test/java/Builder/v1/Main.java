package Builder.v1;

public class Main {
    public static void main(String[] args) {
        try{
            Student student = Student.builder()
                    .withEmail("@xyz.com")
                    .withPhone("98765")
                    .withName("abc", "xyz")
                    .build();
            /* Student student2 = Student.builder()
                    .withEmail("@xyz.com")
                    .withPhone("98765")
                    .build(); */
            System.out.println(student.toString());
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
