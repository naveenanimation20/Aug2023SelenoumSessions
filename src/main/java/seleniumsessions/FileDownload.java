package seleniumsessions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FileDownload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://get.jenkins.io/windows-stable/2.426.1/jenkins.msi");

		String downloadPath = "/Users/naveenautomationlabs/Downloads";
		String fileName = "jenkins.msi";

		File file = new File(downloadPath, fileName);

		FluentWait<File> wait = new FluentWait<File>(file)
				.withTimeout(Duration.ofMinutes(5))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class).withMessage("file is not downloaded");

		try {
			boolean isDownloaded = wait.until(f -> f.exists() && f.canRead());

			if (isDownloaded) {
				System.out.println("file is completely 100% downloaded");
			}

		} catch (TimeoutException e) {
			System.out.println("file is not completely  downloaded");

		}

	}

}
