package co.com.juanmaya.sofka.frameworkreto.model;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

import static co.com.juanmaya.sofka.frameworkreto.helpers.Dictionary.*;

public class Customer {
    private String firstName;
    private String email;
    private String lastName;
    private String password;
    private String dayBirth;
    private String monthBirth;
    private String yearBirth;
    private String address;
    private String city;
    private String postalCode;
    private String mobilePhone;
    private String state;
    private String message;
    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(String dayBirth) {
        this.dayBirth = dayBirth;
    }

    public String getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(String monthBirth) {
        this.monthBirth = monthBirth;
    }

    public String getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(String yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Customer (String language, String country, String emailDomain){

        Faker faker =  Faker.instance(
                new Locale(language, country),
                new Random()
        );

        setEmail(
                faker.name()
                        .username()
                        .concat(emailDomain)
                        .replace(SPACE_STRING, EMPTY_STRING)
        );

        setFirstName(faker.name().firstName());
        setLastName(faker.name().lastName());
        setPassword(faker.number().digits(8));
        setDayBirth(String.valueOf(faker.number().numberBetween(1, 28)));
        setMonthBirth(String.valueOf(faker.number().numberBetween(1, 12)));
        setYearBirth(String.valueOf(faker.number().numberBetween(1980, 2003)));

        setAddress(faker.address().fullAddress());
        setCity(faker.address().city());
        setPostalCode(faker.numerify("#####"));
        setMobilePhone(
                String.valueOf(
                                faker
                                        .number()
                                        .numberBetween(300000000, 399999999))
                        .concat(
                                String.valueOf(
                                        faker.number()
                                                .numberBetween(1, 9)
                                )
                        )
        );
        setState(STATE_BY_DEFAULT_FLORIDA);
        setMessage("Mensaje de prueba, no contestar!");

        //Referencia R de la tienda T
        setReference("R"+faker.numerify("######")+"T"+faker.numerify("###"));
    }
}
