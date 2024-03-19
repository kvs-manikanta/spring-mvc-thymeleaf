package com.kvscode.springboot.springmvcthymeleaf.model;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLang;
    private String favOS;

    public Student()
    {

    }

    public void setFirstName(String theFirstname)
    {
        this.firstName=theFirstname;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String theLastName)
    {
        this.lastName=theLastName;
    }

    public String getFavouriteLang()
    {
        return favouriteLang;
    }

    public void setFavouriteLang(String favouriteLang)
    {
        this.favouriteLang=favouriteLang;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country=country;
    }

    public String getFavOS()
    {
        return favOS;
    }

    public void setFavOS(String favOS)
    {
        this.favOS=favOS;
    }

    
}
