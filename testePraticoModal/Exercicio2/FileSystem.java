import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    public static void main(String[] args) {
        criaArquivo();
    }

    public static void criaArquivo() {
        Path arquivo = Paths.get("C:/Consultores/dadosConsultores.txt");

        if (Files.exists(arquivo)) {

            try {
                List<String> linhas = Files.readAllLines(arquivo);

                LocalDate dataAtual = LocalDate.now();
                Month mesAtual = dataAtual.getMonth();

                List<String> aniversariantes = new ArrayList<>();

                for (String linha : linhas) {
                    String[] partes = linha.split("\\|");

                    if (partes.length >= 3) {
                        String dataNascimento = partes[2];
                        String[] partesData = dataNascimento.split("/");
                        if (partesData.length >= 2) {
                            Integer mesAniversario = Integer.parseInt(partesData[1]);

                            if (mesAniversario == mesAtual.getValue()) {
                                aniversariantes.add(linha);
                            }
                        }
                    }
                }

                String novoArquivo = "aniversariantesDoMes.txt";

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(novoArquivo))) {
                    for (String aniversariante : aniversariantes) {
                        writer.write(aniversariante);
                        writer.newLine();
                    }
                    System.out.println("Arquivo de aniversariantes do mês gerado com sucesso: " + novoArquivo);

                } catch (IOException e) {
                    System.out.println("Erro ao criar o arquivo: " + e.getMessage());
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo" + e.getMessage());
            }
        } else {
            System.out.println("Arquivo não existe...");
        }

    }

}