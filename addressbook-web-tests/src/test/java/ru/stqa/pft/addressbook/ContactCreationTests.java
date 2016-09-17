package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;


public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        gotoAddContactPage();
        fillNewContactForm(new ContactData("testname", "testlastname", "testaddress", "test1@mail.ru", "1111111111", "2222222222"));
        submitContactCreation();
        returnToContactPage();
    }

}
