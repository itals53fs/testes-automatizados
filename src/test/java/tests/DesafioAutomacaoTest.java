package tests;

import entities.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DesafioCadastroPage;

//@Listeners(TM4JTestNGListener.class)
public class DesafioAutomacaoTest extends BaseTest {

    String nome ="Tales";
    String sobrenome = "Tales Félix G";
    String sugestoes = "Codar!";


    @Test
    public void deveCadastrarPessoaExemplo(){
        DesafioCadastroPage cp = new DesafioCadastroPage(getDriver());

                cp.preencherNome(nome)
                .preencherSobrenome(sobrenome)
                .marcarSexo()
                .marcarCarne()
                .marcarFrango()
                .marcarPizza()
                .selecionarMestrado()
                //.marcarVegetariano()
                .clicarCorrida()
                .preencherSugestoes(sugestoes)
                .clicarCadastrar();


        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descNome\"]/span")).getText(), nome);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSobrenome\"]/span")).getText(), sobrenome);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSexo\"]/span")).getText(), "Masculino");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descComida\"]/span")).getText(), "Carne Frango Pizza");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descEscolaridade\"]/span")).getText(), "mestrado");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descEsportes\"]/span")).getText(), "Corrida");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSugestoes\"]/span")).getText(), sugestoes);
    }





}
