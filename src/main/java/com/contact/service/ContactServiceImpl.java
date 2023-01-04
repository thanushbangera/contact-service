package com.contact.service;


import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = Arrays.asList(
            new Contact(1L, "Thanush@gmail.com", "Thanush Bangera", 2411L),
            new Contact(2L, "karthik@gmail.com", "Karthik Angadi", 2413L),
            new Contact(3L, "abhishek@gmail.com", "Abhishek Kumar", 2412L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
