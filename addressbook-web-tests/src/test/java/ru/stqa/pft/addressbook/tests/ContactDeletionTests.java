package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import static org.openqa.selenium.OutputType.*;

public class ContactDeletionTests extends TestBase{
    
    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoContactPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("testname", "testlastname", "testaddress", "test1@mail.ru", "1111111111", "2222222222", "test1"), true);
        }
        app.getContactHelper().selectContacts();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().gotoContactPage();
    }

}
