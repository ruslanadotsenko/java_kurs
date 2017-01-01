package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;
import java.util.Set;


public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.goTo().contactPage();
        Set<ContactData> before = app.contact().all();
        app.goTo().gotoAddContactPage();

        ContactData contact = new ContactData().
                withFirstname("testname").
                withLastname("testlastname").
                withAddress("address").
                withEmail("test@mail.tu").
                withHomephone("1111111111").
                withMobilephone("222222222");

        app.contact().create(contact);
        app.goTo().contactPage();
        Set<ContactData> after = app.contact().all();
        Assert.assertEquals(after.size(), before.size() + 1);

        contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt());
        before.add(contact);
        Assert.assertEquals(before, after);

    }

}
