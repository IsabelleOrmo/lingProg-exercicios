package src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario("Felix", "Almeida", 1000);

        func1.readInfo();
        
        func1.printInfo();
        func2.printInfo();

        func1.setSalarioMensal(func1.getSalarioMensal() * 1.10);
        func2.setSalarioMensal(func2.getSalarioMensal() * 1.10);

        func1.printInfo();
        func2.printInfo();

        input.close();
    }
}
