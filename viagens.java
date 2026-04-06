void main() {

        IO.println("|--------------------------------|");
        IO.println("|==========  Bem-vindo ==========|");
        IO.println("|  ==== sistema de viagens! ==== |");
        IO.println("|--------------------------------|");
        IO.println("");
        IO.println("Por favor, insira os detalhes da sua viagem.");
        IO.println("");

        double dist = Double.parseDouble(IO.readln("Digite a distância da viagem em km: "));

        if (dist > 200) {

            double valor_por_km = 0.50;
            double valor_total1 = dist * valor_por_km;
            IO.println(String.format("O valor total da viagem é: R$ %.2f%n", valor_total1));

        } else {

            double valor_por_km = 0.75;
            double valor_total = dist * valor_por_km;
            IO.println(String.format("O valor total da viagem é: R$ %.2f%n", valor_total));

        }
}