public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C", "17020003", "K62CB ", "17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D", "17020005", "K62CB", "17020004@vnu.edu.vn");

        addStudent(s1);
        addStudent(s2);
        addStudent(s3);
        addStudent(s4);

        studentsByGroup();
        removeStudent("17020001");
        System.out.println("New index is:");
        studentsByGroup();
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    private static Student[] students = new Student[100];

    public static void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    public static String studentsByGroup() {
        String result = "";
        String[] groups = new String[100];
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            boolean isExist = false;
            for (int j = 0; j < count; j++) {
                if (students[i].getGroup().equals(groups[j])) {
                    isExist = true;

                    students[i].setName();
                    students[i].setId();
                    students[i].setGroup();
                    students[i].setEmail();
                }
            }
            if (!isExist) {
                groups[count] = students[i].getGroup();
                System.out.println("Group " + groups[count] + ":");
                count++;
            }
            System.out.println(
                    students[i].getName() + "-" +
                            students[i].getId() + "-" +
                            students[i].getGroup() + "-" +
                            students[i].getEmail());

        }
        return result;
    }

    public static void removeStudent(String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            if (students[i].getId().equals(id)) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                break;
            }
        }
    }
}