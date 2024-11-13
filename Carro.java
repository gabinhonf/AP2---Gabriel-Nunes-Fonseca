class Carro extends Veiculo {
    public int numeroPortas;

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return "Carro: " +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + getAno() +
                "\nNúmero de portas: " + numeroPortas;
    }
}
