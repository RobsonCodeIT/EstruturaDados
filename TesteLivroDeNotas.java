import  javax.swing.JOptionPane;

public class TesteLivroDeNotas {

  public static void main(String args[]) {

    LivroDeNotas livroDeNotas = new LivroDeNotas();
    System.out.println(livroDeNotas.getNomeDoCurso());

    String nomeDoCurso = JOptionPane.showInputDialog(null, "Digite o Nome do Curso");
    livroDeNotas.setNomeDoCurso(nomeDoCurso);
    System.out.println(livroDeNotas.getNomeDoCurso());
  }
}
