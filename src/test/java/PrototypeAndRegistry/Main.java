package PrototypeAndRegistry;

public class Main {
    public static void fillRegistry(StudentRegistry registry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("April 22");
        aprBatchStudent.setAverageBatchPsp(89.0);

        registry.register("april22Batch", aprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.setIq(180);
        aprBatchIntelligentStudent.setBatch("April 22");
        aprBatchIntelligentStudent.setAverageBatchPsp(89.0);

        registry.register("aprBatchIntelligentStudent", aprBatchIntelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        Student siddharth = studentRegistry.get("april22Batch").clone();
        siddharth.setName("Siddharth");
        siddharth.setAge(24);
        siddharth.setStudentPsp(91.0);

        Student intelligentSiddharth = studentRegistry.get("aprBatchIntelligentStudent").clone();
        intelligentSiddharth.setName("Siddharth");
        intelligentSiddharth.setAge(24);
        intelligentSiddharth.setStudentPsp(91.0);
        System.out.println(siddharth.getName()+","+siddharth.getAge()+
                ","+siddharth.getBatch()+","+siddharth.getAverageBatchPsp());
    }
}
