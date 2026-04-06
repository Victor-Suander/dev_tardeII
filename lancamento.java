void main() {
        IO.println("Bem-vindo ao sistema de lançamento, pressione Enter para iniciar a contagem regressiva!");
        IO.readln();
        for (int i = 10; i >= 0; i--) {
            IO.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                IO.println("Contagem interrompida!");
                return;
            }
        }
}
