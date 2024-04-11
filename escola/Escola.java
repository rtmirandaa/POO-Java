

package escola;


public class Escola {   
    public static void main(String[] args) { 
        Professor prof1 = new Professor(12, "(51)8407-4070", "Adalto", 40, "123123123");
        System.out.println("Professor: "+ prof1.nome);
        System.out.println("Telefone: "+  prof1.getFone());
        System.out.println("CPF: " + prof1.getCpf());
        
        //prof1.info();
        
        Aluno a1 = new Aluno(998877,"ADS", "Manha", "PenisTorto", 12, "123.123.123-12" );
    }

}
