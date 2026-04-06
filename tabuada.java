void main() {
        IO.println(" ");
        int numb = Integer.parseInt(IO.readln("Digite um número para ver a tabuada: "));
        IO.println(" ");
        IO.println("Tabuada do " + numb + ":");
        IO.println(" ");

        for (int i = 1; i <= 10; i++) {
            IO.println(numb + " x " + i + " = " + (numb * i));
        }
}