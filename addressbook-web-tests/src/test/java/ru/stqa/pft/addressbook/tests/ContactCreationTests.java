package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoAddContactPage();
        app.getContactHelper().fillNewContactForm(new ContactData("testname", "testlastname", "testaddress", "test1@mail.ru", "1111111111", "2222222222"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoContactPage();
    }

}
