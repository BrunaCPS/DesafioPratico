import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {

        String colaborador;
        String dataAdmissao;
        double salario;
        double emprestimo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do colaborador: ");
        colaborador = entrada.nextLine();

        System.out.println("Informe a data de admissão (dd/mm/yyyy): ");
        dataAdmissao = entrada.nextLine();

        int anoAdmissao = Integer.parseInt(dataAdmissao.split("/")[2]);
        int anoAtual = java.time.Year.now().getValue();
        int tempoDeCasa = anoAtual - anoAdmissao;

        System.out.println("Informe o salário: ");
        salario = entrada.nextDouble();

        do {
            System.out.println("Informe o valor do empréstimo: ");
            emprestimo = entrada.nextDouble();

            if(emprestimo % 2 != 0){
                System.out.println("Insira um valor válido! O valor tem que ser múltiplo de 2...");
            }

        } while (emprestimo % 2 != 0);
        

        if (emprestimo % 2 == 0 & tempoDeCasa > 5 && emprestimo < salario * 2) {
            System.out.println("\nValor do empréstimo: " + emprestimo + " reais");

            System.out.println("\nNotas de maior valor: ");
            notasMaiorValor(emprestimo);
            System.out.println("\nNotas de menor valor: ");
            notasMenorValor(emprestimo);
            System.out.println("\nNotas meio a meio: ");
            System.out.println(emprestimo / 2 + " reais em notas de maior valor: ");
            notasMaiorValor(emprestimo / 2);
            System.out.println(emprestimo / 2 + " reais em notas de menor valor: ");
            notasMenorValor(emprestimo / 2);

        } else {
            System.out.println("Agradecemos seu interesse, mas você não atende os requisitos mínimos do programa...");
        }
    }


    public static void notasMaiorValor(double emprestimo) {

        int nota100 = (int) (emprestimo / 100);
        int resto100 = (int) (emprestimo % 100);
        int nota50 = resto100 / 50;
        int resto50 = resto100 % 50;
        int nota20 = resto50 / 20;
        int resto20 = resto50 % 20;
        int nota10 = resto20 / 10;
        int resto10 = resto20 % 10;
        int nota5 = resto10 / 5;
        int resto5 = resto10 % 5;
        int nota2 = resto5 / 2;

        if (nota100 > 0) {
            System.out.println(nota100 + " x 100 reais");
        }

        if (nota50 > 0) {
            System.out.println(nota50 + " x 50 reais");
        }

        if (nota20 > 0) {
            System.out.println(nota20 + " x 20 reais");
        }

        if (nota10 > 0) {
            System.out.println(nota10 + " x 10 reais");
        }

        if (nota5 > 0) {
            System.out.println(nota5 + " x 5 reais");
        }
        if (nota2 > 0) {
            System.out.println(nota2 + " x 2 reais");
        }

    }

    public static void notasMenorValor(double emprestimo) {

        int nota20 = (int) (emprestimo / 20);
        int resto20 = (int) (emprestimo % 20);
        int nota10 = resto20 / 10;
        int resto10 = resto20 % 10;
        int nota5 = resto10 / 5;
        int resto5 = resto10 % 5;
        int nota2 = resto5 / 2;

        if (nota20 > 0) {
            System.out.println(nota20 + " x 20 reais");
        }

        if (nota10 > 0) {
            System.out.println(nota10 + " x 10 reais");
        }

        if (nota5 > 0) {
            System.out.println(nota5 + " x 5 reais");
        }
        if (nota2 > 0) {
            System.out.println(nota2 + " x 2 reais");
        }
    }
}