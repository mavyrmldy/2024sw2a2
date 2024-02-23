package primeiro_exemplo;

import primeiro_exemplo.modelos.Pessoa;

public class Hello {
    public static void main(String[] args) {
        int cont = 10;
        String nome = "Carlos";
        System.out.println("Olá Mundo!!!");

        System.out.println(cont + " : " + nome);

        Pessoa p1 = new Pessoa();
        
        
        p1.setNome ("Carlos");
        p1.setIdade (18);

        System.out.println(p1.getNome() + " : " + p1.getIdade());

       // Pessoa p2 = p1;
      //  p2.setNome ("Mateus"); 

       // System.out.println(p2.nome);
      //  System.out.println(p1.nome);

      //Pessoa p3 = new Pessoa();
     //   p3.nome = "Zoe";
     //   p3.idade = 5;

    //    System.out.println(p1.verificarMarioridade());
    //    System.out.println(p3.verificarMarioridade());
    }
}