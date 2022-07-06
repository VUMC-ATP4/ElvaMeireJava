package classRoomEight;
import
import pageObjects.academyShop.MainPage;

import javax.swing.*;
import java.util.ArrayList;

public class AcademyShopTests {
    WebDriver driver;
    WebDriverWait wait;
    public final String ACODEMY_SHOP_URL = "http://shop.acodemy.lv/";

    @BeforeMethod
    public void setupBrowser() {
        System.out.println("Pirms testa");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void searchForItemTest() throws InterruptedException {
        driver.get(ACODEMY_SHOP_URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("Beanie");
        System.out.println("Search results count:" + mainPage.getSearchResults().size());
        Assert.assertEquals(2,mainPage.getSearchResults().size());
        List<WebElement> searchResults = mainPage.getSearchResults();

    }

    @Test
    public void searchForItemTestTwo() throws InterruptedException {
        driver.get(ACODEMY_SHOP_URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("Hoodie");
        System.out.println("Search results count:" + mainPage.getSearchResults().size());
        Assert.assertEquals(3,mainPage.getSearchResults().size(),expected:2);
        for (WebElement element : searchResults) {
            System.out.println(element.findElement(By.cssSelector("h2")).getText());
        }
        // var rakstīt arī šādi
        for (int i = 0; i < mainPage.getSearchResults().size(); i++) {
            mainPage.getSearchResults().get(i).findElement(By.cssSelector("h2")).getText();
            System.out.println(mainPage.getSearchResults().get(i).findElement(By.cssSelector("h2")).getText());
            System.out.println(mainPage.getSearchResults().get(i).findElement(By.cssSelector("price")).getText());
        }



    }
    @Test
    public void switchTabsTest(){
        driver.get("https://www.w3schools.com/");
        System.out.println("Atverti tabi: " + driver.getWindowHandles().size());
        driver.findElement(By.id("accept-choices")).click();
        driver.findElement(By.cssSelector("a[title='W3Schools on LinkedIn']")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles()); tabs: size = 2
        System.out.println(driver.getTitle());
        driver.close();
        System.out.println("Atverti tabi: " +driver.getWindowHandles().size());
        System.out.println();
    }
    public void javaScriptExcecutorExampleTest(){
        driver.get("https://www.lu.lv/");
        driver.findElement(By.cssSelector("button[id='ccm__footer__consent-bar-submit']")).click();
    }
    @Test
    public void hoverTest(){
        driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");
        driver.findElement(By.linkText("Link 1")).click();
        WebElement element = driver.findElement(By.cssSelector("div.dropdown2 button"));

    }
    @Test
    public void keyboardClickTest(){
        driver.get("https://www.microsoft.com/applied-sciences/projects/anti-ghosting-demo");
        driver.findElement(By.id("clickToUseButton")).click();
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .keyDown(Keys.ALT)
                .keyDown(Keys.DELETE)
                .perform();

    }
    @Test
    public void keyboardClickTest() throws InterruptedException {
        driver.get("https://www.microsoft.com/applied-sciences/projects/anti-ghosting-demo");
        driver.findElement(By.id("clickToUseButton")).click();
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .keyDown(Keys.ALT)
                .perform();

        Thread.sleep(5000);

        new Actions(driver)
                .keyUp(Keys.ALT)
                .perform();

        Thread.sleep(5000);
    }



    @Test
    public void javaScriptExecutorExampleTest() throws InterruptedException {
        driver.get("https://www.lu.lv/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[id='ccm__footer__consent-bar-submit']")).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3000)");
        Thread.sleep(2000);
        driver.findElement(By.className("footer__up")).click();
        Thread.sleep(2000);
        System.out.println();
    }
    WebElement element = driver.findElement(By.linkText("Kontakti"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


    @AfterMethod
    public void tearDownBrowser() {
        System.out.println("Pēc testa");
        driver.quit();
    }



















}
