void main() {

    IO.println("******************************");
    IO.println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
    IO.println("******************************");
    IO.println("1. Tensão (em Volt)");
    IO.println("2. Resistência (em Ohm)");
    IO.println("3. Corrente (em Ampére)");
    IO.println("4. Sair do programa");
    IO.println("******************************");

    char opcao = IO.readln("Qual grandeza deseja calcular? ").charAt(0);

    if (opcao == '1') {
        double R = Double.parseDouble(IO.readln("Digite a Resistência (Ohm): "));
        double I = Double.parseDouble(IO.readln("Digite a Corrente (Ampére): "));
        double U = R * I;

        IO.println("U = R * I");
        IO.println("Tensão (U): " + U + " V");

    } else if (opcao == '2') {
        double U = Double.parseDouble(IO.readln("Digite a Tensão (Volt): "));
        double I = Double.parseDouble(IO.readln("Digite a Corrente (Ampére): "));
        double R = U / I;

        IO.println("R = U / I");
        IO.println("Resistência (R): " + R + " Ohm");

    } else if (opcao == '3') {
        double U = Double.parseDouble(IO.readln("Digite a Tensão (Volt): "));
        double R = Double.parseDouble(IO.readln("Digite a Resistência (Ohm): "));
        double I = U / R;

        IO.println("I = U / R");
        IO.println("Corrente (I): " + I + " A");

    } else if (opcao == '4') {
        IO.println("Programa encerrado.");

    } else {
        IO.println("Opção inválida!");
    }
}