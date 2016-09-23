package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by ruslana on 18.09.16.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testModificationTests() {
        app.getNavigationHelper().gotoContactPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("testname", "testlastname", "testaddress", "test1@mail.ru", "1111111111", "2222222222", "test1"), true);
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new ContactData("testname", "testlastname", "testaddress", "test1@mail.ru", "1111111111", "2222222222", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoContactPage();


    }
}

