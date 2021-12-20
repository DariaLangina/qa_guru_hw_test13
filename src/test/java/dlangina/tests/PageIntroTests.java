package dlangina.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;

@Epic("Продукты")
@Feature("Информация о продукте")
@Story("Блок информации о продукте")
@Tag("smoke")
public class PageIntroTests extends TestBase {
//
//  @AllureId("#6217")
//  @DisplayName("Проверка компонентов информационного блока продукта R‑Vision SENSE")
//  @Test
//  void checkInfoBlockComponentsForSense() {
//    step("Открытие страницы продукта R‑Vision SENSE", () ->
//        open("https://new.rvision.ru/products/sgrc"));
//    step("Проверка компонентов информационного блока", () -> {
//      $(".page-intro__title")
//          .shouldBe(Condition.visible)
//          .shouldHave(Condition.exactText("R‑Vision SGRC"));
//      $(".page-intro__desc")
//          .shouldBe(Condition.visible)
//          .shouldHave(Condition.exactText(
//              "Автоматизация управления информационной безопасностью, рисками и соответствия требованиям"));
//      $(".page-intro__content")
//          .shouldHave(text("Материалы"))
//          .shouldHave(text("Запросить демо"));
//    });
//  }
//
//  @AllureId("6218")
//  @DisplayName("Проверка перехода на блок 'Запрос на демо' по нажатию кнопки 'Запросить демо'")
//  @Test
//  void checkScrollingToDemoBlockByClickButton() {
//    step("Открытие страницы продукта R‑Vision SENSE", () -> {
//      open("https://new.rvision.ru/products/sgrc");
//      $("#demomodal").shouldBe(attribute("data-animate", "false"));
//    });
//    step("Нажатие кнопки 'Запросить демо'", () ->
//        $(".page-intro__content").$(byText("Запросить демо")).click());
//    step("Проверка отображения блока 'Запросить демо'", () ->
//        $("#demomodal").shouldBe(attribute("data-animate", "true")));
//  }
//
//  @AllureId("6219")
//  @Tag("smoke")
//  @DisplayName("Проверка перехода на блок 'Материалы' по нажатию кнопки 'Материалы'")
//  @Test
//  void checkScrollingToMaterialsBlockByClickButton() {
//    step("Открытие страницы продукта R‑Vision SENSE", () -> {
//      open("https://new.rvision.ru/products/sgrc");
//      $("#productmaterials").shouldBe(attribute("data-animate", "false"));
//    });
//    step("Нажатие кнопки 'Материалы'", () ->
//        $(".page-intro__content").$(byText("Материалы")).click());
//    step("Проверка отображения блока 'Материалы'", () ->
//        $("#productmaterials").shouldBe(attribute("data-animate", "true")));
//  }
}