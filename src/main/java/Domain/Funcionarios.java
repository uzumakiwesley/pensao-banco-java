package Domain;

public class Funcionarios {

    private int idFuncionarios;

    private String nome;

    private String sobrenome;

    private String funcao;

    private Double salario;

    public Funcionarios() {}

    public Funcionarios(int idFuncionario, String nome, String sobrenome, String funcao, Double salario) {
        this.idFuncionarios = idFuncionario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.funcao = funcao;
    }

    public int getIdFuncionarios() {
        return idFuncionarios;
    }

    public void setIdFuncionarios(int idFuncionario) {
        this.idFuncionarios = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() { return salario; }

    public void setSalario(Double salario) { this.salario = salario; }
}
