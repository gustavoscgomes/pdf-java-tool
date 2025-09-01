package io.github.gustavoscgomes;

import io.github.gustavoscgomes.utils.RegexUtils;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfExtractor {
    /**
     * Extrai os dados de uma proposta de empréstimo de um arquivo PDF.
     *
     * @param filePath O caminho completo para o arquivo PDF.
     * @return Um objeto Proposta com os dados extraídos.
     * @throws IOException Se o arquivo não puder ser lido.
     */
    public Proposta extractData(String filePath) throws IOException {
        try (PDDocument document = Loader.loadPDF(new File(filePath))) {
            PDFTextStripper textStripper = new PDFTextStripper();
            String text = textStripper.getText(document);

            // Cria uma nova instância de Proposta
            Proposta proposta = new Proposta();

            // Preenche os dados da proposta usando o RegexUtils
            proposta.setCorrespondente(RegexUtils.getCorrespondente(text));
            proposta.setOperador(RegexUtils.getOperador(text));
            proposta.setChave(RegexUtils.getChave(text));
            proposta.setCpfOperador(RegexUtils.getCpfOperador(text));
            proposta.setCpfCliente(RegexUtils.getCpfCliente(text));
            proposta.setNomeCliente(RegexUtils.getNomeCliente(text));
            proposta.setDocumentoIdentificacao(RegexUtils.getDocumentoIdentificacao(text));
            proposta.setAgencia(RegexUtils.getAgencia(text));
            proposta.setConta(RegexUtils.getConta(text));
            proposta.setNumeroProposta(RegexUtils.getNumeroProposta(text));
            proposta.setLinhaDeCredito(RegexUtils.getLinhaCredito(text));
            proposta.setValorSolicitado(RegexUtils.getValorSolicitado(text));
            proposta.setPrazoEmMeses(RegexUtils.getPrazoEmMeses(text));
            proposta.setValorTotal(RegexUtils.getValorTotalEmprestimo(text));
            proposta.setSeguro(RegexUtils.getSeguro(text));
            proposta.setNomeConvenio(RegexUtils.getNomeConvenio(text));
            proposta.setNumeroConvenio(RegexUtils.getNumeroConvenio(text));

            return proposta;
        }
    }
}
