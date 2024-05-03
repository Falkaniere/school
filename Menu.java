import java.util.Scanner;

public class Menu {

    private StudentDAO alunosDAO;

    public static void ManageMenu() {

        int choice;
        do {
            RenderMenu();
            System.out.println("Informe uma opção do Menu: ");
            choice = Utils.inputInt();
            ChooseMenu(choice);
        } while(choice != 4);
    }

    public static void ChooseMenu(int choice) {
        switch (choice) {
            case 1:
                MenageStudentSubMenu();
                break;
        }
    }

    public static void RenderMenu() {
        System.out.println("Menu:");
        System.out.println("=======================");
        System.out.println("1-Gerenciar ALUNOS");
        System.out.println("2-Gerenciar DISCIPLINAS");
        System.out.println("3-Gerenciar CURSOS");
        System.out.println("4-SAIR");
        System.out.println("=======================");
    }

    public static void MenageStudentSubMenu() {

        int choice;
        do {
            RenderStudentSubMenu();
            System.out.println("Informe uma opção do Menu: ");
            choice = Utils.inputInt();
            ChoiceStudentSubMenu(choice);
        } while(choice != 5);
    }

    public static void ChoiceStudentSubMenu(int choice) {
        switch (choice) {
            case 1:
                StudentDAO.Register();
                break;
            case 2:
                StudentDAO.Read();
                break;
            case 3:
                StudentDAO.Remove();
                break;
            case 4:
                StudentDAO.Update();
                break;
        }
    }
    public static void RenderStudentSubMenu() {
        System.out.println("Submenu Aluno:");
        System.out.println("=======================");
        System.out.println("1-Cadastrar ALUNO");
        System.out.println("2-Consultar ALUNO");
        System.out.println("3-Remover ALUNO");
        System.out.println("4-Atualizar ALUNO");
        System.out.println("5-Voltar ao MENU INICIAL");
        System.out.println("=======================");
    }

}
