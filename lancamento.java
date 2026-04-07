void main() {

    IO.println("  |-----------------------------------------------|");
    IO.println("  |      SISTEMA DE LANÇAMENTO DE FOGUETE         |");
    IO.println("  |-----------------------------------------------|");
    IO.println("Bem-vindo ao sistema de lançamento!");
    IO.println("A contagem regressiva será iniciada de 10 até 0.");
    IO.println("Pressione Enter para iniciar...");

    IO.readln();

    for (int i = 10; i >= 0; i--) {
        IO.println(i);

        try {
            Thread.sleep(1000); // pausa de 1 segundo
        } catch (InterruptedException e) {
            IO.println("Contagem interrompida!");
            return;
        }
    }

    IO.println("Ignição!");

}
