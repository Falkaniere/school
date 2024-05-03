import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDAO {

    private static int id = 0;
    public static List<Student> studentList = new ArrayList<>();

    public static void Register() {
        int idStudent = ++id;

        System.out.println("Informe o nome: ");
        String name = Utils.inputString();

        System.out.println("Informe a idade: ");
        int age = Utils.inputInt();

        System.out.println("Informe o cpf: ");
        String cpf = Utils.inputString();

        System.out.println("Informe o curso: ");
        String course = Utils.inputString();

        Student student = new Student(idStudent, name, age, cpf, course);
        studentList.add(student);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void Read() {
        for (Student student : studentList) {
            System.out.println(student.toString());
            System.out.println("--------------");
        }
    }

    public static void Remove() {
        System.out.println("Escolha o aluno que deseja remover: ");

        for (Student student : studentList) {
            System.out.println(student.alunamenu());
        }

        System.out.println("Opção: ");
        int idStudent = Utils.inputInt();

        Optional<Student> student = studentList.stream().filter(a -> a.getId() == idStudent).findFirst();

        if (student.isEmpty()) {
            System.out.println("Aluno nao encontrado!");
        } else {
            studentList.remove(student.get());
            System.out.println("Aluno removido!");
        }

    }

    public static void Update() {
        System.out.println("Escolha o aluno que deseja atualizar: ");

        for (Student student : studentList) {
            System.out.println(student.alunamenu());
        }

        System.out.println("Opção: ");
        int idStudent = Utils.inputInt();

        Optional<Student> student = studentList.stream().filter(a -> a.getId() == idStudent).findFirst();

        if (student.isEmpty()) {
            System.out.println("Aluno nao encontrado!");
        } else {
           System.out.println("Informe o name: ");
           String name = Utils.inputString();
           if (!name.isEmpty()) {
               student.get().setName(name);
           }

           System.out.println("Informe a idade: ");
           int idade = Utils.inputInt();
           if (idade > 0) {
               student.get().setAge(idade);
           }

           System.out.println("Informe o cpf: ");
           String cpf = Utils.inputString();
           if (!cpf.isEmpty()) {
               student.get().setCPF(cpf);
           }

           System.out.println("Informe o curso: ");
           String course = Utils.inputString();
           if (!course.isEmpty()) {
               student.get().setCourse(course);
           }

            student.get().atualizaAll(name, idade, cpf, course);
        }
    }

}
