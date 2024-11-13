class Moto extends Veiculo {
    private int cilindrada;

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return "Moto: " +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + getAno() +
                "\nCilindrada: " + cilindrada + " cc";
    }
}
