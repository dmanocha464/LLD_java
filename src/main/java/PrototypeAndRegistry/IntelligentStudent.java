package PrototypeAndRegistry;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class IntelligentStudent extends Student{
    int iq;
    public IntelligentStudent(IntelligentStudent student) {
        super(student); // fill the attributes specific to parent
        this.iq = student.iq; // fill its own attributes
    }
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

}
