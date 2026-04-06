void main() {
    IO.println("      _______________________________________________");
    IO.println("      |               CÁLCULO DE DESCONTOS           |");
    IO.println("      |----------------------------------------------|");
    IO.println("      |Código" + " - Condicão de Pagamento" + " - Desconto (%) |");
    IO.println("      |         1" + " - À vista no dinheiro" + " - 10%        |");
    IO.println("      |         2" + " - Cartão de débito" + " - 5%            |");
    IO.println("      |         3" + " - Cartão de crédito" + " - 3%           |");
    IO.println("      |         4" + " - PIX" + " - 7.5%                       |");
    IO.println("      |----------------------------------------------|");

    int valor_compra = Integer.parseInt(IO.readln("Digite o valor total da compra: (R$)"));
    char codigo = IO.readln("Digite a forma de pagamento: (cod 1-4)").charAt(0);

    if (codigo == '1') {
        double desconto = valor_compra * 0.10;
        double valor_final = valor_compra - desconto;
        IO.println("Valor final com desconto: R$ " + valor_final);
    } else if (codigo == '2') {
        double desconto = valor_compra * 0.05;
        double valor_final = valor_compra - desconto;
        IO.println("Valor final com desconto: R$ " + valor_final);
    } else if (codigo == '3') {
        double desconto = valor_compra * 0.03;
        double valor_final = valor_compra - desconto;
        IO.println("Valor final com desconto: R$ " + valor_final);
    } else if (codigo == '4') {
        double desconto = valor_compra * 0.075;
        double valor_final = valor_compra - desconto;
        IO.println("Valor final com desconto: R$ " + valor_final);
    } else {
        IO.println("Código de pagamento inválido. Por favor, insira um código entre 1 e 4.");
    }
}
