package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoContactPage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNavigationHelper().gotoAddContactPage();
        app.getContactHelper().createContact(new ContactData("testname", "testlastname", "testaddress", "test1@mail.ru", "1111111111", "2222222222", "test1"), true);
        app.getNavigationHelper().gotoContactPage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
