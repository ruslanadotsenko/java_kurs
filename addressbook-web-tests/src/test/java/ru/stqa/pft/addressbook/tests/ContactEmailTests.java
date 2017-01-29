package ru.stqa.pft.addressbook.tests;



import org.hamcrest.MatcherAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


public class ContactEmailTests extends TestBase{

    @BeforeMethod
    public void  ensurePreconditions(){
        app.goTo().gotoHomePage();
        if (app.contact().all().size()== 0){
            app.contact().create(new ContactData().withFirstname("Firstname").withLastname("Lastname")
                    .withAddress("street Yellow, 24")
                    .withEmail("test_email.23@mail.ru").withEmail2("test_email.2@mail.ru").withEmail3("test_email.3@mail.ru")
                    .withHomephone("+7 (936) 1234543").withMobilephone("22-22-22").withWorkphone("12 23 34 45"));
        }
    }

    @Test
    public void  testContactEmail() {
        app.goTo().gotoHomePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getAllEmails(), equalTo(mergeEmails(contactInfoFromEditForm)));

}

    private String mergeEmails(ContactData contact) {
        return Arrays.asList(contact.getEmail(), contact.getEmail2(), contact.getEmail3())
                .stream().filter((s) -> ! s.equals(""))
                .map(ContactPhoneTests::cleaned)
                .collect(Collectors.joining("\n"));
        
    }

}
