public class Pessoa {
    private int idade;
    private int ano;
    private String nome;

    public Pessoa(int ano, String nome) {
        this.ano = verifyAno(ano);
        this.nome = nome;
    }

    public Pessoa(int ano, String nome, int anoAtual) {
        this.ano = verifyAno(ano);
        this.nome = nome;
        calculaIdade(anoAtual);
    }

    public Pessoa(){
        this.ano = 0;
        this.idade = 0;
        this.nome = null;
        calculaIdade(1000);
    }

    private int verifyAno(int ano) {
        if (ano < 1000) {
            return 1000;
        } else {
            return ano;
        }
    }

    public void calculaIdade(int anoAtual) {
        this.idade = anoAtual - ano;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
