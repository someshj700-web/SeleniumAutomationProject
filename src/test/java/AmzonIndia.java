import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmzonIndia {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/AMPEREUS%C2%AE-Medium-Size-Trolley-Cover/dp/B0FF21BWFT/?_encoding=UTF8&pd_rd_w=kNLjh&content-id=amzn1.sym.c7856867-7399-4487-8ea1-2895e0decba2%3Aamzn1.symc.96b8365e-3b12-433f-a173-648d41788658&pf_rd_p=c7856867-7399-4487-8ea1-2895e0decba2&pf_rd_r=J67ZE3JR82HB660WTNZ1&pd_rd_wg=0opfc&pd_rd_r=79ddaaba-cc5c-4cea-b8d3-c6dfd00fc571&ref_=pd_hp_d_btf_ci_mcx_mr_hp_atf_m&th=1");
     WebElement ti=driver.findElement(By.xpath("//a[@title='Share']"));
        String somesh=ti.getAttribute("title");
        System.out.println(somesh);

//        WebElement hover=driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
//        Actions action=new Actions(driver);
//
//        action.moveToElement(hover).perform();
//
//        if(hover.isDisplayed()){
//            System.out.println("Yes");
//        }else{
//            System.out.println("Not");
//        }


driver.quit();
    }
}
