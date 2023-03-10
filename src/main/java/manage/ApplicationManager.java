package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;

    UserHelper user;

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://trello.com/");

        user = new UserHelper(wd);
        user.login("irinaa.kren@gmail.com","nezabudka0890");
    }

    public void quit(){
        wd.close();
        wd.quit();
    }

    public UserHelper getUser() {   //generate-getter
        return user;
    }
}
