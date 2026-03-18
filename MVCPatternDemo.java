public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create a student record
        Student model = new Student();
        model.setName("Robert");
        model.setRollNo("10");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to manage the model and view
        StudentController controller = new StudentController(model, view);

        // Display the initial student details
        controller.updateView();

        // Update the student details
        controller.setStudentName("John");

        // Display the updated student details
        controller.updateView();
    }
}

class Student {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: " + studentName + ", Roll No: " + studentRollNo);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
