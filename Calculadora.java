import  javax.swing.JOptionPane;

public class Calculadora {

  static char menu() {
    //metodo estatico, de classe,
    //não precisa associar a um objeto nem instanciar

    String  auxiliar;

    auxiliar = JOptionPane.showInputDialog("Digite a Opcao: \n+ - soma\n- - subtracao\ns - sair"); //sempre devolve uma String
    char op = auxiliar.charAt(0);//devolve o caractere na posicao 0
    return op;
  }

  public static void main(String args[]) {

    int opcao;

    do {
      opcao = menu();

      switch(opcao) {


      }
    } while (opcao != 's' && opcao != 'S');
  }
}
