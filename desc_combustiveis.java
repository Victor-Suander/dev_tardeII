void main() {
        IO.println("  |-----------------------------------------------|");
        IO.println("  | ===============TABELA DE DESCONTOS ========== |");
        IO.println("  |                   ALCOOL:                     |");
        IO.println("  |-----------------------------------------------|");
        IO.println("  |Até 20 litros: 3% de desconto por Litro,       |");
        IO.println("  | acima de 20 litros: 5% de desconto por Litro  |");
        IO.println("  |-----------------------------------------------|");
        IO.println("  |                   GASOLINA:                   |");
        IO.println("  | Até 20 litros: 4% de desconto por Litro,      |");
        IO.println("  | acima de 20 litros: 6% de desconto por Litro  |");
        IO.println("  |-----------------------------------------------|");
        IO.println("");

        char tipo_comb = IO.readln("Digite o tipo de combustível (A para Álcool, G para Gasolina): ").charAt(0);
        double qtd_litros = Double.parseDouble(IO.readln("Digite a quantidade de litros: "));
        double preco_gasolina;
        double preco_alcool;

        if (tipo_comb == 'A' || tipo_comb == 'a') {
            preco_alcool = 2.89;
            double desconto;
            if (qtd_litros <= 20) {
                desconto = preco_alcool * 0.03;
            } else {
                desconto = preco_alcool * 0.05;
            }
            double valor_total = (preco_alcool - desconto) * qtd_litros;
            IO.println("Valor total a pagar: R$ " + valor_total);
        } else if (tipo_comb == 'G' || tipo_comb == 'g') {
            preco_gasolina = 4.95;
            double desconto;
            if (qtd_litros <= 20) {
                desconto = preco_gasolina * 0.04;
            } else {
                desconto = preco_gasolina * 0.06;
            }
            double valor_total = (preco_gasolina - desconto) * qtd_litros;
            IO.println("Valor total a pagar: R$ " + valor_total);
        } else {
            IO.println("Tipo de combustível inválido. Por favor, digite 'A' para Álcool ou 'G' para Gasolina.");

     }
}
