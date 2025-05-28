package locator_category;

public class LocatorsCategory {
    //URL Login
    public static String urlLogin = "https://cms.anhtester.com/login";

    //Login
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String btnLogin = "//button[normalize-space()='Login']";

    //menu Products
    public static String menuProducts = "//ul[@id='main-menu']/descendant::span[normalize-space()='Products']";

    //menu-item Category
    public static String menuItemCategory = "//ul[@id='main-menu']/descendant::span[normalize-space()='Category']";

    //button Add New Category
    public static String btnAddNewCategory = "//a[@href='https://cms.anhtester.com/admin/categories/create']";

    //Locator Page Add New Category
    public static String inputName = "//input[@id='name']";

    ////dropdown Parent Category
    public static String dropdownParentCategory = "//label[text()='Parent Category']/following-sibling::div/descendant::button[@title='No Parent']";
    public static String inputSearchParentCategory = "//label[text()='Parent Category']/following-sibling::div/descendant::input[@type='search']";


    public static String inputOrderingNumber = "//input[@id='order_level']";

    ////dropdown Type
    public static String dropdownType = "//label[text()='Type']/following-sibling::div/descendant::button[@type='button']";

    public static String selectOptionType = "//label[text()='Type']/following-sibling::div/descendant::span[normalize-space()='%s']";

    public static String chooseBanner = "//input[@name='banner']/parent::div";
    public static String chooseIcon = "//input[@name='icon']/parent::div";
    public static String selectFileBannerIcon = "//div[@data-value='%d']";

    public static String buttonAddFileBannerIcon = "//button[text()='Add Files']";

    public static String inputMetaTitle = "//input[@name='meta_title']";
    public static String inputMetaDescription = "//textarea[@name='meta_description']";

    ////dropdown Filtering Attributes
    public static String dropdownFilteringAttributes = "//label[text()='Filtering Attributes']/following-sibling::div/descendant::button[@type='button']";
    public static String inputSearchFilteringAttributes = "//label[text()='Filtering Attributes']/following-sibling::div/descendant::input[@type='search']";

    public static String selectOptionFilteringAttributes(String filteringAttribute) {
        String xpathFilteringAttributes = "//label[text()='Filtering Attributes']/following-sibling::div/descendant::span[normalize-space()='" + filteringAttribute + "']";
        return xpathFilteringAttributes;
    }

    public static String buttonSave = "//button[text()='Save']";

    //input search Category
    public static String inputSearchCategory = "//h5[text()='Categories']/following-sibling::form/descendant::input[@id='search']";

    public static String valueNameCategoryAffer = "//div[@class='card']//tbody//td[2]";
}
