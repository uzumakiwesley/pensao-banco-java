package Domain;

public class Hospedes {

    private int idHospede;

    private String nome;

    private String sobrenome;

    private String telefone;

    private int idQuartos;

    public Hospedes() {}

    public Hospedes(int idHospede, String nome, String sobrenome, String telefone, int idQuartos) {
        this.idHospede = idHospede;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.idQuartos = idQuartos;
    }

    public int getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdQuartos() {
        return idQuartos;
    }

    public void setIdQuartos(int idQuartos) {
        this.idQuartos = idQuartos;
    }
}
