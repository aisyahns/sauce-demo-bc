package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    // di class LoginPage kita bisa pakai method2 dan variabel yang dimiliki oleh PageObject

    //kita akan define variabel + method yang akan dimapping ke setiap method stepnya

    //1. perlu ngebuat variabel/method untuk element + selectornya
    // fieldUsername -> id=user-name
    // fieldPassword -> id=password
    // loginButton -> id=login-button
    // errorMessage -> data-test=error
    // productHeader -> class=product-label

    private By fieldUsername = By.id("user-name");
    private By fieldPassword = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//h3[@data-test = 'error']");
    private By productHeader = By.xpath("//div[@class='product_label']");

    //DONE define pencarian elementnya
    //2. buat method yang di dalamnya berisi action2 yang akan dilakukan di setiap element
    //perlu mapping method ini di bagian stepnya juga

    @Step
    public void goToLoginPage(){
        //kita perlu ada action untuk ke halaman login page
        openAt("/v1/index.html"); //open ini akan ngebuka halaman yg kita configure di file serenity.properties

    }

    @Step
    public void inputUsername(){
        // melakukan action input value username ke field username
        // cari element field username

        $(fieldUsername).type("standard_user");

        // cari sebuah element yg punya selector dari fieldUsername
        // element itu lah yg bisa kita kasih aksi
    }

    @Step
    public void inputPassword(){
        $(fieldPassword).type("secret_sauce");
    }

    @Step
    public void clickLoginBtn(){
        $(loginButton).click();
    }

    @Step
    public void verifyProductHeader(){
        $(productHeader).isDisplayed();
    }
}
