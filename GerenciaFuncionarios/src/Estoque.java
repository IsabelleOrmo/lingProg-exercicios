package src;
import java.util.Scanner;

public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;
    
    public Estoque() {
        nome = null; 
        qtdAtual = 0;
        qtdMinima = 0;
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome; 
        this.qtdAtual = verifica(qtdAtual);
        this.qtdMinima = verifica(qtdMinima);
    }

    private int verifica(int valor) {
        if (valor < 0)
            return 0; 
        return valor; 
    }
    
    public void repor(int qtd) {
        this.qtdAtual = verifica(this.qtdAtual + verifica(qtd));
    }

    public void darBaixa(int qtd) {
        this.qtdAtual = verifica(this.qtdAtual - verifica(qtd));
    }

    public void mostra() {
        System.out.println("\n\nNome do produto:  " + nome);
        System.out.println("Quantidade mínima:  " + qtdMinima);
        System.out.println("Quantidade atual:  " + qtdAtual);
        System.out.println("Reestoque:  ");

        if (precisaRepor()) {
            System.out.print("Necessário");
        } else {
            System.out.print("Não necessário");
        }
    }

    public void escreve(Scanner input) {
        System.out.print("\nDigite o nome do produto a ser adicionado ao estoque:  ");
        this.nome = input.nextLine();
        System.out.print("\nDigite o estoque atual do produto:  ");
        this.qtdAtual = verifica(input.nextInt()); 
        System.out.print("\nDigite o estoque mínimo para o produto:  "); 
        this.qtdMinima = verifica(input.nextInt());
    }

    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }

    public int getQtdMinima() {
        return this.qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = verifica(qtdMinima);
    };

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
		return this.qtdAtual;
	}

    public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = verifica(qtdAtual);
	}


}
