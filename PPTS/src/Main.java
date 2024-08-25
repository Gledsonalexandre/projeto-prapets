import models.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(2, "Luciene", "luci02", "81958746921",

                "Rua Dalila", null);

        System.out.println("O nome do usuário é : " + usuario1.getNome());

        System.out.println("mora na Rua " + usuario1.getEndereco() + " e seu número de telefone é " + usuario1.getTelefone() + ".");

        System.out.println("---------------------------------------------------------");
    }
}

