package br.edu.ifc.poo.aula09;

public class Carro extends Abastecer implements Acoes {

    private String modelo;
    private Marca marca;
    private Proprietario proprietario;
    private Integer velMax;
    private Integer velAtual;
    private Integer numMarchas;
    private Integer marchaAtual;
    private Integer volCombustivel;

    public Carro(Proprietario p, Marca marca) {
        this.proprietario = p;
        this.marca = marca;
    }

    public Integer exibirVolumeCombustivel() {
        return this.volCombustivel;
    }

    @Override
    public void acelera() throws Exception {
        Integer novaVelocidade = this.velAtual + 1;
        if (novaVelocidade > velMax) {
            throw new Exception("Velocidade máxima atingida.");
        }
        this.velAtual = novaVelocidade;
    }

    @Override
    public void freia() throws Exception {
        this.velAtual = 0;
    }

    @Override
    public void trocaMarcha() throws Exception {
        Integer novaMarcha = this.marchaAtual + 1;
        if (novaMarcha > numMarchas) {
            throw new Exception("Já está na última marcha!");
        }
        this.marchaAtual = novaMarcha;
    }

    @Override
    public void reduzMarcha() throws Exception {
        Integer novaMarcha = this.marchaAtual - 1;
        if (novaMarcha < numMarchas) {
            throw new Exception("Marcha Inválida!");
        }
        this.marchaAtual = novaMarcha;
    }

    @Override
    public void comGasolinaComum(Integer litros) {
        this.volCombustivel += litros;
        super.autonomia = volCombustivel * 10;
    }

    @Override
    public void comGasolinaAditivada(Integer litros) {
        this.volCombustivel += litros;
        super.autonomia = volCombustivel * 14;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getVelMax() {
        return velMax;
    }

    public void setVelMax(Integer velMax) {
        this.velMax = velMax;
    }

    public Integer getVelAtual() {
        return velAtual;
    }

    public void setVelAtual(Integer velAtual) {
        this.velAtual = velAtual;
    }

    public Integer getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(Integer numMarchas) {
        this.numMarchas = numMarchas;
    }

    public Integer getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(Integer marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public Integer getVolCombustivel() {
        return volCombustivel;
    }

    public void setVolCombustivel(Integer volCombustivel) {
        this.volCombustivel = volCombustivel;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", proprietario=" + proprietario + ", velMax=" + velMax + ", velAtual=" + velAtual + ", numMarchas=" + numMarchas + ", marchaAtual=" + marchaAtual + ", volCombustivel=" + volCombustivel + '}';
    }

}
