void main() {

    IO.println("  |-----------------------------------------------|");
    IO.println("  |           VERIFICAÇÃO DE VELOCIDADE           |");
    IO.println("  |-----------------------------------------------|");

    double velocidade = Double.parseDouble(IO.readln("Digite a velocidade em Km/h: "));
    int limite = 80;

    if (velocidade > limite) {
        double excesso = velocidade - limite;
        double multa = excesso * 50;

        IO.println("Limite = " + limite + "Km/h");
        IO.println("Excedeu " + excesso + "Km/h");
        IO.println("Multa = " + excesso + "Km/h * R$ 50,00");
        IO.println("Valor da multa: R$ " + multa);
    } else {
        IO.println("Você está dentro do limite de velocidade.");
    }
}