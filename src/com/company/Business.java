package com.company;

public class Business extends Contact{
    private Long phoneNumber;

    public Business(String name, String email, Long phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {     //Overrides original display method, adds phone number
        super.display();
        System.out.println("Phone Number: " + phoneNumber);
    }
}
