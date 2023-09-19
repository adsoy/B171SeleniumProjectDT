package groupWork;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.TestBase;

public class AlertTestleri extends TestBase {
    @Test
    public void simpleAlert() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();

        Alert alert = driver.switchTo().alert();
        String alertMesaj = alert.getText();
        System.out.println(alertMesaj);

        alert.accept();
    }

    @Test
    public void confirmAlertTesti() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("confirmButton")).click();

        System.out.println("Alert Mesajı: " + driver.switchTo().alert().getText());
        bekle(2);
        driver.switchTo().alert().dismiss();
        bekle(2);
    }

    @Test
    public void prompAlertTesti() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("promtButton")).click();

        Alert alert = driver.switchTo().alert();

        bekle(2);
        System.out.println("Alert Mesajı: " + alert.getText());
        alert.sendKeys("Gürkay");
        alert.accept();
        bekle(2);

    }

    @Test
    public void noAlertPresentException() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("timerAlertButton")).click();

        bekle(2);

        driver.switchTo().alert().accept();
    }

    @Test
    public void unhandledAlertException() {
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("timerAlertButton")).click();

        bekle(6);

    }
}
