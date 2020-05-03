package service;

import model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailServiceImpl implements EmailService {
    private static List<Email> list = new ArrayList<>();
    @Override
    public Email showInformation(String name) {
        Email email1 = null;
        for (Email email:list){
            if (email.getName().equals(name)){
                email1 = email;
            }
        }
        return email1;
    }

    @Override
    public boolean updateInformation(String name,Email email) {
        boolean update = false;
        for (Email email1:list){
            if (email1.getName().equals(name)){
                list.remove(email1);
                update = list.add(email);
            }
        }
        return update;
    }

    @Override
    public void addEmail(Email email) {
        list.add(email);
    }
}
