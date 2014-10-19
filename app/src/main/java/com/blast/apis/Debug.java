package com.blast.apis;

import com.blast.Contact;
import com.blast.Person;

import java.util.ArrayList;

/**
 * Created by khanguy on 10/19/14.
 */
public class Debug {

    public static final String alexTwitter= "";
    public static final String alexEmail= "";
    public static final String alexPhone= "";
    public static final String aliTwitter = "";
    public static final String aliEmail = "";
    public static final String aliPhone = "";


    public static ArrayList<Person> people(){
        ArrayList<Person> out = new ArrayList<Person>();
        ArrayList<Contact> alexList = new ArrayList<Contact>();
        ArrayList<Contact> aliList = new ArrayList<Contact>();
        alexList.add(new Contact("twitter",alexTwitter));
        alexList.add(new Contact("email",alexEmail));
        alexList.add(new Contact("phone",alexPhone));
        aliList.add(new Contact("twitter",aliTwitter));
        aliList.add(new Contact("email",aliEmail));
        aliList.add(new Contact("phone",aliPhone));
        out.add(new Person("Alex",alexList));
        out.add(new Person("Ali",aliList));
        return out;
    }
}
