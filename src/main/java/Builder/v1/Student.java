package Builder.v1;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Integer age;
    private Double experience;

    //step-1 hide constructor
    private Student(){}
    public static Builder builder(){
        return new Builder();
    }
    //step-2 create static inner class - friend class
    static class Builder{
        // step 2.5 copy all the fields from the outer class
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private Integer age;
        private Double experience;
        // Method chaining - fluent interfaces
        public Builder withEmail(String email){
            this.email=email;
            return this;
        }
        public Builder withPhone(String phone){
            this.phoneNumber=phone;
            return this;
        }
        public Builder withName(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
            return this;
        }
        public Builder withAge(Integer age){
            this.age=age;
            return this;
        }
        public Builder withExperience(Double experience){
            this.experience=experience;
            return this;
        }
        //step 3 create the build method
        public Student build(){
            //copy the value from builder object to main object
            if(!isValid()){
                throw new IllegalArgumentException("Name is invalid");
            }
            Student student=new Student();
            student.email=email;
            student.phoneNumber=phoneNumber;
            student.firstName=firstName;
            student.lastName=lastName;
            return student;
        }
        private boolean isValid(){
            if(firstName==null){
                return false;
            }
            return true;
        }
    }

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
