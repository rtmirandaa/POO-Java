package escola;
public class Professor extends Pessoa implements Secretariaa{
    public int cargaHoraria;
    private String fone;

    public Professor(int cargaHoraria, String fone, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.cargaHoraria = cargaHoraria;
        this.fone = fone;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    public void mostrar(){
        System.out.println("\nINFORMAÇÔES DO SISTEMA: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + super.getCpf()); 
    }
    
    public void info(){
        super.mostrar();
        System.out.println("Carga Horária: "+ this.cargaHoraria);
        System.out.println("Telefone: "+ this.fone);
        System.out.println("Fim das informações \n" );
    }

    @Override
    public void dadosAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
