package service;

import model.Email;

public interface EmailService {
    public Email showInformation(String name);
    public boolean updateInformation(String name,Email email);
    public void addEmail(Email email);
}
