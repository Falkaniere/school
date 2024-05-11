public class Subject {
  private String name;
  private int cargaHoraria;
  private double grade;

  public Subject(String name, int cargaHoraria, double grade) {
      this.name = name;
      this.cargaHoraria = cargaHoraria;
      this.grade = grade;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getCargaHoraria() {
      return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
      this.cargaHoraria = cargaHoraria;
  }

  public double getGrade() {
      return grade;
  }

  public void setGrade(double grade) {
      this.grade = grade;
  }
}
