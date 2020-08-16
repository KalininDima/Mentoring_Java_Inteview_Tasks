package InterviewQuestions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.ArrayList;

public class TestFiveButtins {

    static AllButtons objButtons;

    public static void main(String[] args) {
//
//        objButtons = new AllButtons();
//        objButtons.start();

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://te.dev.secureci.com/Exercise2.html");
        ArrayList<WebElement> list = new ArrayList<>(driver.findElements(By.xpath("//div[@class='slider round']")));
        for (int i = 0; i < list.size(); i++) {
                    list.get(i).click();
        }

    }
}

    class AllButtons extends Thread {


        public WebDriver driver;

        public void run() {

//            actions = new Actions(driver);
//            actions.click(list.get(0)).
//                    click(list.get(1)).
//                    click(list.get(2)).
//                    click(list.get(3)).
//                    click(list.get(4)).
//                    build().perform();
            driver = new ChromeDriver();
            driver.get("http://te.dev.secureci.com/Exercise2.html");
            ArrayList<WebElement> list = new ArrayList<>(driver.findElements(By.xpath("//div[@class='slider round']")));
            for (int i = 0; i < list.size(); i++) {
                list.get(i).click();
            }


        }


    }


    class First extends Thread implements Runnable {


    }

    class Second extends Thread implements Runnable {

    }

    class Third extends Thread {

    }

    class Fourth extends Thread {

    }

    class Fiveth extends Thread {

    }