import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Classe de teste para a funcionalidade de login da TelaLogin.
 */
public class TelaLoginTeste {

    /**
     * Teste com dados corretos
     */
    @Test
    public void loginTeste() {
        // Cria uma instância da classe TelaLogin
        TelaLogin telaLogin = new TelaLogin();

        // Testar o método login com um usuário e senha válidos
        boolean resultado = telaLogin.login("Gustavo Bassanetto", "12345");

        // Se o login foi bem-sucedido ele retorna uma mensagem de texto indicando o sucesso do teste
        Assertions.assertTrue(resultado, "O login foi realizado com sucesso!");
    }
    /**
     * Teste com dados incorretos
     */
    @Test
    public void loginTesteErro() {
        // Cria uma instância da classe TelaLogin
        TelaLogin telaLogin = new TelaLogin();

        // Testar o método login com um usuário e senha inválidos
        boolean resultado = telaLogin.login("Calabreso", "Não me dar nota 10");

        //
        Assertions.assertFalse(resultado, "Usuario ou senha incorretos!");
    }

    /**
     * Mais testes podem ser adicionados a baixo
     */
}