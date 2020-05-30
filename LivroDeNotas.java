//frequentam o curso

public class  LivroDeNotas {

    private String nomeDoCurso;

    //definir um construtor com parametro nomeDoCurso
    public LivroDeNotas(String nomeDoCurso) {

      this.nomeDoCurso = nomeDoCurso;
    }

    //necesario redefinir o construtor padrao
    public LivroDeNotas() {
      
    }

    //Métodos de acesso
    //consultar o valor de uma variavel de instância ou atributo
    public String getNomeDoCurso() {

      return nomeDoCurso;
    }

    //metodos modificadores
    public void setNomeDoCurso(String nomeDoCurso) {

      this.nomeDoCurso = nomeDoCurso;
    }
  }
