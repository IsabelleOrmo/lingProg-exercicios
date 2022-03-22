package src;
import java.util.Scanner;

public class Funcionario {
    String nome;
    String sobrenome;
    double salarioMensal;

    public Funcionario() {
        nome = "";
        sobrenome = "";
        salarioMensal = 0;
    }

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = verifySalarioMensal(salarioMensal);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = verifySalarioMensal(salarioMensal);
    }

    private double verifySalarioMensal(double salarioMensal) {
        if (salarioMensal < 0) {
            return 0; 
        } else {
            return salarioMensal;
        }
    }

    public double salarioAnual(double salarioMensal) {
        return salarioMensal * 13; 
    }

    public void printInfo() {
        System.out.println("\n\nNome do funcionário:  " + nome + " " + sobrenome);
        System.out.println("Salário mensal:  " + salarioMensal);
        System.out.println("Salário anual:  " + salarioAnual(salarioMensal));
    }

    public void readInfo() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Digite o nome do funcionário:  ");
        setNome(input.nextLine());
        System.out.print("Digite o sobrenome do funcionário:  ");
        setSobrenome(input.nextLine());
        System.out.print("Digite o salário mensal do funcionário:  ");
        setSalarioMensal(input.nextDouble());

        input.close();
    }
}