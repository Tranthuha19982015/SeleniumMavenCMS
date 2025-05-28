package locator_category;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddNewCategory extends BaseTest {
    public static void loginCMS() {
        driver.findElement(By.xpath(LocatorsCategory.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCategory.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCategory.btnLogin)).click();
    }

    public static void addNewCategory(String name) throws InterruptedException {
        // Click on menu item Category
        driver.findElement(By.xpath(LocatorsCategory.menuProducts)).click();
        // Click on menu item Category
        driver.findElement(By.xpath(LocatorsCategory.menuItemCategory)).click();
        // Click on button Add New Category
        driver.findElement(By.xpath(LocatorsCategory.btnAddNewCategory)).click();
        // Add information for new category
        driver.findElement(By.xpath(LocatorsCategory.inputName)).sendKeys(name);

        driver.findElement(By.xpath(LocatorsCategory.dropdownParentCategory)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCategory.inputSearchParentCategory)).sendKeys("Sport shoes", Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCategory.inputOrderingNumber)).sendKeys("280525");

        driver.findElement(By.xpath(LocatorsCategory.dropdownType)).click();
        Thread.sleep(1000);
        String type = String.format(LocatorsCategory.selectOptionType, "Digital");
        driver.findElement(By.xpath(type)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCategory.chooseBanner)).click();
        Thread.sleep(1000);
        String banner = String.format(LocatorsCategory.selectFileBannerIcon, 3202);
        driver.findElement(By.xpath(banner)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCategory.buttonAddFileBannerIcon)).click();

        driver.findElement(By.xpath(LocatorsCategory.chooseIcon)).click();
        Thread.sleep(1000);
        String icon = String.format(LocatorsCategory.selectFileBannerIcon, 3200);
        driver.findElement(By.xpath(icon)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCategory.buttonAddFileBannerIcon)).click();

        driver.findElement(By.xpath(LocatorsCategory.inputMetaTitle)).sendKeys("Meta Title Test 01");
        driver.findElement(By.xpath(LocatorsCategory.inputMetaDescription)).sendKeys("Meta Description Test 01");

        driver.findElement(By.xpath(LocatorsCategory.dropdownFilteringAttributes)).click();
        Thread.sleep(1000);
        String filteringAttribute = "Quality3";
        driver.findElement(By.xpath(LocatorsCategory.inputSearchFilteringAttributes)).sendKeys(filteringAttribute);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCategory.selectOptionFilteringAttributes(filteringAttribute))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCategory.dropdownFilteringAttributes)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCategory.buttonSave)).click();
    }

    public static void searchCategory(String name) throws InterruptedException {
        driver.findElement(By.xpath(LocatorsCategory.inputSearchCategory)).sendKeys(name, Keys.ENTER);
        Thread.sleep(2000);
    }


    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCMS();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = now.format(formatter);

        String categoryName = "Category Test " + dateTime;
        addNewCategory(categoryName);
        searchCategory(categoryName);

        // Verify if the category is added successfully
        String actualCategoryName = driver.findElement(By.xpath(LocatorsCategory.valueNameCategoryAffer)).getText();
        if (actualCategoryName.equals(categoryName)) {
            System.out.println("Category added successfully: " + actualCategoryName);
        } else {
            System.out.println("Failed to add category. Expected: " + categoryName + ", but got: " + actualCategoryName);
        }

        Thread.sleep(3000);
        closeDriver();
    }
}
