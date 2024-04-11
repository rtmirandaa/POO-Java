

package escola;
public abstract class Pessoa {
    public String nome;
    public int idade; 
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    // métodos 
    public void mostrar(){
         System.out.println("\nINFORMAÇÔES DO SISTEMA: ");
         System.out.println("Nome: " + this.nome);
         System.out.println("Idade: " + this.idade);
         System.out.println("CPF: " + this.cpf); 
          
    }
}
