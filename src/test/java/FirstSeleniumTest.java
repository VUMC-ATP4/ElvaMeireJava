import ...



public class FirstSeleniumTest {
    WebDriver chromeParluks;

    @Test
    public void testPageTitle(){
        this.chromeParluks = new ChromeDriver();//atvert parlukprogrammu
        this.chromeParluks.navigate().to( "")
    }
}
