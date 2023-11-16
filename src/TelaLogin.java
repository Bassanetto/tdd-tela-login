public class TelaLogin {
    private String loginArmazenado = "Gustavo Bassanetto";
    private String senhaArmazenada = "12345";

    public boolean login(String usuario, String senha) {
        return verificarUsuario(usuario) && verificarSenha(senha);
    }

    private boolean verificarUsuario(String usuario) {
        if (usuario == null) {
            return false;
        }

        return loginArmazenado.equals(usuario);
    }
    private boolean verificarSenha(String senha) {
        if (senha == null) {
            return false;
        }

        return senhaArmazenada.equals(senha);
    }
}