package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helpers.ChromeDriverHelper;
import helpers.ScreenshotHelper;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class StepDefinitions {
	
	ChromeDriver driver;
	
	@Dado("Acessar a página de autenticação")
	public void acessar_a_página_de_autenticação() {
	   driver = ChromeDriverHelper.create("http://hlruffo-002-site1.ctempurl.com/");
	}

	@Dado("Informar o email de acesso {string}")
	public void informar_o_email_de_acesso(String email) {
	    driver.findElement(By.id("Email")).sendKeys(email);
	}

	@Dado("Informar a senha de acesso {string}")
	public void informar_a_senha_de_acesso(String senha) {
	    driver.findElement(By.id("Senha")).sendKeys(senha);
	}

	@Dado("Solicitar o acesso à minha conta de usuário")
	public void solicitar_o_acesso_à_minha_conta_de_usuário() {
	    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/form/div[3]/input")).click();
	}

	@Dado("Selecionar aba Cadastrar Movimentação")
	public void selecionar_aba_cadastrar_movimentação() {
	    driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	}

	@Dado("Informar nome da movimentação {string}")
	public void informar_nome_da_movimentação(String nome) {
		driver.findElement(By.id("Nome")).sendKeys(nome);
	    
	}

	@Dado("Informar data da movimentação {string}")
	public void informar_data_da_movimentação(String data) {
	    driver.findElement(By.id("Data")).sendKeys(data);
	}

	@Dado("Informar valor da movimentação {string}")
	public void informar_valor_da_movimentação(String valor) {
	    driver.findElement(By.id("Valor")).sendKeys(valor);
	}

	@Dado("Selecionar o tipo da movimentação {string}")
	public void selecionar_o_tipo_da_movimentação(String tipo) {
	    if (tipo.equals("Conta a pagar")) {
	    	driver.findElement(By.xpath("//input[@name='Tipo'][@value='2']")).click();	  
	    }else {
	    	driver.findElement(By.xpath("//input[@name='Tipo'][@value='1']")).click();
	    }
	    
	}

	@Dado("Informar a descrição da movimentação {string}")
	public void informar_a_descrição_da_movimentação(String descricao) {
	    driver.findElement(By.id("Descricao")).sendKeys(descricao);
	}

	@Dado("Selecionar a categoria {string}")
	public void selecionar_a_categoria(String categoria) {
		new Select(driver.findElement(By.id("CategoriaId"))).selectByVisibleText(categoria);
	}

	@Quando("Solicitar o cadastro")
	public void solicitar_o_cadastro() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Então("A Movimentação não é salva com sucesso")
	public void a_movimentação_não_é_salva_com_sucesso() {
		String nome = "Evidencia de falha.png";
	    ScreenshotHelper.print(driver, nome);
	    driver.close();
	}


}
