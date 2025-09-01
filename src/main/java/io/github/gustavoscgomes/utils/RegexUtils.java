package io.github.gustavoscgomes.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {

    /**
     * Extrai um valor de string do texto do PDF usando uma expressão regular.
     *
     * @param text O texto completo do PDF.
     * @param regex A expressão regular com um grupo de captura para o valor.
     * @return O valor extraído ou uma string vazia se não for encontrado.
     */
    private static String extractString(String text, String regex) {
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.DOTALL);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1).trim();
        }
        return "";
    }

    /**
     * Extrai um valor numérico (double) do texto do PDF.
     *
     * @param text O texto completo do PDF.
     * @param regex A expressão regular com um grupo de captura para o valor numérico.
     * @return O valor numérico extraído.
     */
    private static double extractDouble(String text, String regex) {
        String value = extractString(text, regex);
        // Remove caracteres de formatação de moeda e substitui vírgula por ponto.
        value = value.replaceAll("[^\\d,.]", "").replace(",", ".");
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    /**
     * Extrai um valor numérico (int) do texto do PDF.
     *
     * @param text O texto completo do PDF.
     * @param regex A expressão regular com um grupo de captura para o valor inteiro.
     * @return O valor inteiro extraído.
     */
    private static int extractInt(String text, String regex) {
        String value = extractString(text, regex);
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static String getCorrespondente(String text) {
        return extractString(text, "Correspondente\\n(.*?)\\nOperador");
    }

    public static String getOperador(String text) {
        return extractString(text, "Operador\\n(.*?)\\n2-Dados do Cliente");
    }

    public static String getChave(String text) {
        return extractString(text, "Chave\\n(.*?)\\n");
    }

    public static String getCpfOperador(String text) {
        return extractString(text, "CPF Operador\\n(.*?)\\nConta");
    }

    public static String getCpfCliente(String text) {
        return extractString(text, "2-Dados do Cliente\\nCPF\\n(.*?)\\nDocumento de Identificação");
    }

    public static String getNomeCliente(String text) {
        return extractString(text, "Chave.*?\\nNome\\n(.*?)\\nAgência");
    }

    public static String getDocumentoIdentificacao(String text) {
        return extractString(text, "Documento de Identificação\\n(.*?)\\n");
    }

    public static String getAgencia(String text) {
        return extractString(text, "Agência\\n(.*?)\\nLoja");
    }

    public static String getConta(String text) {
        return extractString(text, "Conta\\n(.*?)\\nInformações Complementares do CET");
    }

    public static String getNumeroProposta(String text) {
        return extractString(text, "Número da proposta:\\n\"?,??\"(.*?)\"");
    }

    public static String getLinhaCredito(String text) {
        return extractString(text, "Linha de crédito:\\n\"?,??\"(.*?)\"");
    }

    public static double getValorSolicitado(String text) {
        return extractDouble(text, "Valor solicitado\\n\"?,??\"(.*?)\"");
    }

    public static int getPrazoEmMeses(String text) {
        return extractInt(text, "Prazo em Meses:\\n\"?,??\"(.*?)\"");
    }

    public static double getValorTotalEmprestimo(String text) {
        return extractDouble(text, "Valor Total do Empréstimo:\\n\"?,??\"(.*?)\"");
    }

    public static String getSeguro(String text) {
        return extractString(text, "O cliente adere à apólice de seguro de vida\\? \\(SIM ou NÃO\\)\\n(.*?)\\n5- Convênio");
    }

    public static String getNomeConvenio(String text) {
        return extractString(text, "Nome do convênio\\n(.*?)\\nNúmero do Convênio");
    }

    public static String getNumeroConvenio(String text) {
        return extractString(text, "Número do Convênio\\n(.*?)\\n6-Autorização de Débito");
    }
}
