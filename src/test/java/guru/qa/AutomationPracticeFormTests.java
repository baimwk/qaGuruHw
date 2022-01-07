package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void automationPracticeFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Иван");
        $("#lastName").setValue("Иванов");
        $("#userEmail").setValue("test@test.qa");
        $(byText("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1998");
        $("[class*='react-datepicker__day--020']").click();
        $("#subjectsInput").setValue("Bio").pressEnter();
        $(byText("Music")).click();
        File testFile = new File("src/test/resources/1.png");
        $("#uploadPicture").uploadFile(testFile);
        $("#currentAddress").setValue("Russia");
        $("#state").scrollTo().click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();

        $(".modal-content").shouldBe(visible);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $$x("//*[@class='modal-body']//td[1]").shouldHave(
                texts(
                        "Student Name",
                        "Student Email",
                        "Gender",
                        "Mobile",
                        "Date of Birth",
                        "Subjects",
                        "Hobbies",
                        "Picture",
                        "Address",
                        "State and City"
                ));
        $$x("//*[@class='modal-body']//td[2]").shouldHave(
                texts(
                        "Иван Иванов",
                        "test@test.qa",
                        "Male",
                        "1234567890",
                        "20 August,1998",
                        "Biology",
                        "Music",
                        "1.png",
                        "Russia",
                        "Haryana Karnal"
                ));
        $x("//button[text()='Close']").shouldBe(visible).shouldHave(text("Close"));
    }
}
