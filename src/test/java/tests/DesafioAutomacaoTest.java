package tests;


import entities.BaseTest;
import org.testng.annotations.Test;
import pages.DesafioCadastroPage;

//@Listeners(TM4JTestNGListener.class)
public class DesafioAutomacaoTest extends BaseTest {

    String nome ="Aline";
    String sobrenome = "Zanin";
    String sugestoes = "colocar o codigo no git";


    @Test
    public void deveCadastrarPessoaExemplo(){
        DesafioCadastroPage cp = new DesafioCadastroPage(getDriver());
                 cp.preencherNome(nome)
                .preencherSobrenome(sobrenome)
                .clicarCadastrar();
    }





}
