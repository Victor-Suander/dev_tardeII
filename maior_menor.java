void main(){
        int num1 = Integer.parseInt(IO.readln("Digite o primeiro número: "));
        int num2 = Integer.parseInt(IO.readln("Digite o segundo número: "));
        int num3 = Integer.parseInt(IO.readln("Digite o terceiro número: "));
        int soma = num1 + num2 + num3;
        int media = soma / 3;

        if (num1 == num2 && num2 == num3) {
            IO.println("Os números são iguais.");
            IO.println("A média dos números é: " + media);
            IO.println("A soma dos números é: " + soma);
        } else {
            int maior = num1;
            int menor = num1;

            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }
            if (num2 < menor) {
                menor = num2;
            }
            if (num3 < menor) {
                menor = num3;
            }

            IO.println("O maior número é: " + maior);
            IO.println("O menor número é: " + menor);
            IO.println("A média dos números é: " + media);
            IO.println("A soma dos números é: " + soma);
        }
}
