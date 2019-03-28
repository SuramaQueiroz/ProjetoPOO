package ProjetoCarro;

public class Carro {
    String modelo;
    String cor;
    String marca;
    String chassi;
    int ano;
    int nPortas;
    int nMarcha;
    int marchaAtual;
    double velocidade;
    double velocidadeMaxima;
    double velocidadeAtual;
    double volumeCombustivel;
    boolean tetoSolar;
    boolean cambioAutomatico;
    double acelera;
    double freia;
    int trocarMarcha;
    Proprietario proprietario;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public int getnMarcha() {
        return nMarcha;
    }

    public void setnMarcha(int nMarcha) {
        this.nMarcha = nMarcha;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(double volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public double getAcelera() {
        return acelera;
    }

    public void setAcelera(double acelera) {
        this.acelera = acelera;
    }

    public double getFreia() {
        return freia;
    }

    public void setFreia(double freia) {
        this.freia = freia;
    }

    public int getTrocarMarcha() {
        return trocarMarcha;
    }

    public void setTrocarMarcha(int trocarMarcha) {
        this.trocarMarcha = trocarMarcha;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
