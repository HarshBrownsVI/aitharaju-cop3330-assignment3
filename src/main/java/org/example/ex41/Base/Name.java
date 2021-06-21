package org.example.ex41.Base;

import org.jetbrains.annotations.NotNull;

public class Name implements Comparable<Name>
{
    /*
    Create a class Name to create an object that store first and last names.
    Create variables firstName and lastName
    Name(firstName, lastName)
        equal this.firstName to the variable firstName
        equal this.LastName to the variable lastName
     getFirstName()
        return variable firstName
     getLastName()
        return variable lastName
     setFirstName()
        set this.firstName to the variable firstName
     setLastName()
        set this.lastName to the variable lastName
     Create compareTo method to compare the lastNames in order to put them in order
     Create toString method to print out the first and last Name
     */
    String firstName;
    String lastName;
    public Name(String lastName, String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Name otherLast)
    {
        if(this.lastName.compareTo(otherLast.getLastName()) == 0)
        {
            if(this.firstName.compareTo(otherLast.getFirstName()) < 0)
                return -10;
            return 10;
        }
        return this.lastName.compareTo(otherLast.getLastName());
    }

    @Override
    public String toString()
    {
        return lastName + " " + firstName;
    }

}
