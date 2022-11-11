package Domain;

public class Quartos {

    private int idQuartos;

    private String nome;

    private String valor;

    private Number ramal;

    public Quartos() {}

    public Quartos(int idQuartos, String nome, String valor, String Ramal) {
        this.idQuartos= idQuartos;
        this.nome = nome;
        this.valor = valor;
        this.ramal = ramal;
    }

    public int getIdQuarto() {
        return idQuartos;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuartos = idQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Number getRamal() {
        return ramal;
    }

    public void setRamal(Number ramal) {
        this.ramal = ramal;
    }
}
