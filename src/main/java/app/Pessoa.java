package app;

public class Pessoa {
    private String nome;
    private String situacao;
    private int matricula;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String consultarSituacao() {
        return situacao;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }    
    
}
