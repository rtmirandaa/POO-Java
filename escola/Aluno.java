
package escola;
public class Aluno extends Pessoa {
    public int RA;
    public String curso;
    public String turno; 
    
    //construtor
    public Aluno(int RA, String curso, String turno, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.RA = RA;
        this.curso = curso;
        this.turno = turno;
    }

    //getters e setters
    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
    public void dadosAluno(){
        super.mostrar();
        System.out.println("RA: "+ RA);
        System.out.println("Curso: "+ curso);
        System.out.println("Turno: "+ turno);
}
}
    

