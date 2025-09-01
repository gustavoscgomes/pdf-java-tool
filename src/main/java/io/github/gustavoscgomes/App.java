package io.github.gustavoscgomes;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String filePath = "src/main/resources/pdfs/Proposta-175996099.pdf";

        PdfExtractor extractor = new PdfExtractor();

        try {
            // Extrai os dados do PDF
            Proposta proposta = extractor.extractData(filePath);

            // Imprime os dados extraídos no console
            System.out.println("Dados da Proposta Extraídos:");
            System.out.println("---------------------------");
            System.out.println(proposta);

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
