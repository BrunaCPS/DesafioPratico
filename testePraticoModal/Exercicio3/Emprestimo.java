import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {

        String colaborador;
        String dataAdmissao;
        Integer salario;
        Integer emprestimo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do colaborador: ");
        colaborador = entrada.nextLine();

        System.out.println("Informe a data de admissão: ");
        dataAdmissao = entrada.nextLine();

        Integer anoAdmissao = Integer.parseInt(dataAdmissao.split("/")[2]);
        Integer anoAtual = java.time.Year.now().getValue();
        Integer tempoDeCasa = anoAtual - anoAdmissao;

        System.out.println("Informe o salário: ");
        salario = entrada.nextInt();

        do {
            System.out.println("Informe o valor do empréstimo: ");
            emprestimo = entrada.nextInt();
        } while (emprestimo % 2 != 0);

        if (tempoDeCasa > 5 && emprestimo < salario * 2) {
            System.out.println("Valor do empréstimo: " + emprestimo + " reais");

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

    public static void notasMaiorValor(Integer emprestimo) {

        Integer nota100 = emprestimo / 100;
        Integer resto100 = emprestimo % 100;
        Integer nota50 = resto100 / 50;
        Integer resto50 = resto100 % 50;
        Integer nota20 = resto50 / 20;
        Integer resto20 = resto50 % 20;
        Integer nota10 = resto20 / 10;
        Integer resto10 = resto20 % 10;
        Integer nota5 = resto10 / 5;
        Integer resto5 = resto10 % 5;
        Integer nota2 = resto5 / 2;

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

    public static void notasMenorValor(Integer emprestimo) {

        Integer nota20 = emprestimo / 20;
        Integer resto20 = emprestimo % 20;
        Integer nota10 = resto20 / 10;
        Integer resto10 = resto20 % 10;
        Integer nota5 = resto10 / 5;
        Integer resto5 = resto10 % 5;
        Integer nota2 = resto5 / 2;

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