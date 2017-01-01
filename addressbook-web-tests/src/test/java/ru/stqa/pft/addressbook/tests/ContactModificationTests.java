package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 * Created by ruslana on 18.09.16.
 */
public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void  ensurePreconditions(){
        app.goTo().contactPage();
        if (app.contact().all().size()== 0){
        app.contact().create(new ContactData());
        }
    }

    @Test
    public void testModificationTests() {

        Set<ContactData> before = app.contact().all();
        ContactData modifiedContact = before.iterator().next();

        ContactData contact = new ContactData().
                        withId(modifiedContact.getId()).
                        withFirstname("testname").
                        withLastname("testlastname").
                        withAddress("testaddress").
                        withEmail("test1@mail.ru").
                        withHomephone("1111111111").
                        withMobilephone("2222222222");
        app.contact().modify(contact);
        app.goTo().contactPage();
        Set<ContactData> after = app.contact().all();
        Assert.assertEquals(after.size(), before.size());

        before.remove(modifiedContact);
        before.add(contact);
        Assert.assertEquals(before, after);}


}

