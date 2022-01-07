package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
        $("#uploadPicture").uploadFromClasspath("1.png");
        $("#currentAddress").setValue("Russia");
        $("#state").scrollTo().click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();

        $(".modal-content").shouldBe(visible);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-content").shouldHave(
                text("Student Name"), text("Иван Иванов"),
                text("Student Email"), text("test@test.qa"),
                text("Gender"), text("Male"),
                text("Mobile"), text("1234567890"),
                text("Date of Birth"), text("20 August,1998"),
                text("Subjects"), text("Biology"),
                text("Hobbies"), text("Music"),
                text("Picture"), text("1.png"),
                text("Address"), text("Russia"),
                text("State and City"), text("Haryana Karnal")
        );
        $(byText("Close")).shouldBe(visible);
    }
}
