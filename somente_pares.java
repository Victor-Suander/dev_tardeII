void main() {

        IO.println(" |-------------------------------------------|");
        IO.println(" |------          BEM VINDO !!        -------|");
        IO.println(" |Pronto pra ver os numeros pares de 1 a 100?|");
        IO.println(" |-------------------------------------------|");


        char resp = IO.readln("Digite 's' para sim ou 'n' para não: ").charAt(0);
        IO.println("  ");

        if (resp == 's' || resp == 'S') {
            IO.println("Aqui estão os números pares de 1 a 100:");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    IO.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        IO.println("Foi interrompida a sessao!");
                        return;
                    }
                }
            }
        } else if (resp == 'n' || resp == 'N') {
            IO.println("Quando quiser, é só executar o programa novamente");
        } else {
            IO.println("Resposta inválida!! Digite 's' ou 'n'");
        }
}
