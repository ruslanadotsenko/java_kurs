package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


public class ContactAddressTests extends TestBase{

    @BeforeMethod
    public void  ensurePreconditions(){
        app.goTo().gotoHomePage();
        if (app.contact().all().size()== 0){
            app.contact().create(new ContactData().withFirstname("Firstname").withLastname("Lastname")
                    .withAddress("street Yellow, 24").withEmail("test_email.23@mail.ru").withHomephone("+7 (936) 1234543")
                    .withMobilephone("22-22-22").withWorkphone("12 23 34 45"));
        }
    }


    @Test
    public void  testContactAddress() {
        app.goTo().gotoHomePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getAddress(), equalTo(contactInfoFromEditForm.getAddress()));

    }

}


