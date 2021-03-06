package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactPhoneTests extends TestBase{


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
    public void  testContactPhone() {
        app.goTo().gotoHomePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getAllPhones(), equalTo(mergePhones(contactInfoFromEditForm)));
    }

    private String mergePhones(ContactData contact) {
        return Arrays.asList(contact.getHomephone(), contact.getMobilephone(), contact.getWorkphone())
                .stream().filter((s) -> ! s.equals(""))
                .map(ContactPhoneTests::cleaned)
                .collect(Collectors.joining("\n"));
    }

    public static String cleaned(String phone) {
        return  phone.replaceAll("\\s", "").replaceAll("[-()]", "");
    }
}
