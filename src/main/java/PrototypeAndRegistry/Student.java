package PrototypeAndRegistry;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
        this.studentPsp = student.studentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
