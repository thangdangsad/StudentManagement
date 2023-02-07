public class Student {
    private String name, id, group, email;

    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup() {
        this.group = group;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    public void setInfo(String info) {
        String[] arr = info.split(" - ");
        name = arr[0];
        id = arr[1];
        group = arr[2];
        email = arr[3];
    }

    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}
