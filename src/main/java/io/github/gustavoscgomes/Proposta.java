package io.github.gustavoscgomes;

public class Proposta {

    private String correspondente;
    private String operador;
    private String chave;
    private String cpfOperador;
    private String cpfCliente;
    private String nomeCliente;
    private String documentoIdentificacao;
    private String agencia;
    private String conta;
    private String numeroProposta;
    private String linhaDeCredito;
    private double valorSolicitado;
    private int prazoEmMeses;
    private double valorTotal;
    private String seguro;
    private String nomeConvenio;
    private String numeroConvenio;

    public Proposta() {
    }

    public String getCorrespondente() {
        return correspondente;
    }

    public void setCorrespondente(String correspondente) {
        this.correspondente = correspondente;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getCpfOperador() {
        return cpfOperador;
    }

    public void setCpfOperador(String cpfOperador) {
        this.cpfOperador = cpfOperador;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public void setDocumentoIdentificacao(String documentoIdentificacao) {
        this.documentoIdentificacao = documentoIdentificacao;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNumeroProposta() {
        return numeroProposta;
    }

    public void setNumeroProposta(String numeroProposta) {
        this.numeroProposta = numeroProposta;
    }

    public String getLinhaDeCredito() {
        return linhaDeCredito;
    }

    public void setLinhaDeCredito(String linhaDeCredito) {
        this.linhaDeCredito = linhaDeCredito;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public int getPrazoEmMeses() {
        return prazoEmMeses;
    }

    public void setPrazoEmMeses(int prazoEmMeses) {
        this.prazoEmMeses = prazoEmMeses;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    @Override
    public String toString() {
        return "Proposta{" +
                "correspondente='" + correspondente + '\'' +
                ", operador='" + operador + '\'' +
                ", chave='" + chave + '\'' +
                ", cpfOperador='" + cpfOperador + '\'' +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", documentoIdentificacao='" + documentoIdentificacao + '\'' +
                ", agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", numeroProposta='" + numeroProposta + '\'' +
                ", linhaDeCredito='" + linhaDeCredito + '\'' +
                ", valorSolicitado=" + valorSolicitado +
                ", prazoEmMeses=" + prazoEmMeses +
                ", valorTotal=" + valorTotal +
                ", seguro='" + seguro + '\'' +
                ", nomeConvenio='" + nomeConvenio + '\'' +
                ", numeroConvenio='" + numeroConvenio + '\'' +
                '}';
    }
}
