package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class ContactPhoneTests extends TestBase{

    @Test
    public void  testContactPhone() {
        app.goTo().gotoHomePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getHomephone(), equalTo(cleaned(contactInfoFromEditForm.getHomephone())));
        assertThat(contact.getMobilephone(), equalTo(cleaned(contactInfoFromEditForm.getMobilephone())));
        assertThat(contact.getWorkphone(), equalTo(cleaned(contactInfoFromEditForm.getWorkphone())));
    }

    public String cleaned(String phone) {
        return  phone.replaceAll("\\s", "").replaceAll("[-()]", "");
    }
}
