void main(){
    String user1 = "atila";
    String user2 = "olivi";
    String password1 = "12345";
    String password2 = "54321";

    String users = IO.readln("Digite o usuário: ");
    String password = IO.readln("Digite a senha: ");

    if ((users.equals(user1) && password.equals(password1)) || (users.equals(user2) && password.equals(password2))) {
        IO.println("Login bem-sucedido! Bem-vindo, " + users + "!");
    } else {
        IO.println("Login falhou! Nome de usuário ou senha incorretos.");
    }
}
