public class Student {

    private int id;
    private String name;
    private int age;
    private String cpf;
    private String course;

    public Student(int id, String name, int age, String cpf, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", idade=" + age +
                ", cpf='" + cpf + '\'' +
                ", curso='" + course + '\'' +
                '}';
    }

    public String alunamenu() {
        return id + " - " + name;
    }

    public void updateAll(String name, int age, String cpf, String course) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.course = course;
    }
}
