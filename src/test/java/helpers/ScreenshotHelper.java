package helpers;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHelper {
	public static void print(ChromeDriver driver, String nomeArquivo) {
		try {
			File imagem  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File(nomeArquivo));
		}
		catch(Exception erro){
			erro.printStackTrace();
			}
		}
}
