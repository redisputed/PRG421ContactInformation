

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author john
 */
public class Contact
{

    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private String age;
    private String emailAddress;
    private String cellNumber;

    public Contact(String firstName, String middleName, String lastName,
                   String nickName, String age, String emailAddress,
                   String cellNumber)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.setAge(age);
        this.emailAddress = emailAddress;
        this.cellNumber = cellNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public String getName()
    {
        String name;
        if ("none".equals(nickName))
        {
            String mname = ("none".equals(middleName)) ? " " : " " + middleName + " ";
            name = firstName + mname + lastName;
        }
        else
        {
            name = firstName + " '" + nickName + "' " + lastName;
        }
        return name;
    }

    public String getAge()
    {
        return age;
    }

    private void setAge(String a)
    {
        int intAge = Integer.parseInt(a);

        if (0 > intAge || 120 < intAge)
        {
            throw new IllegalArgumentException("Invalid Age");
        }

        this.age = String.valueOf(intAge);

    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getCellNumber()
    {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber)
    {
        this.cellNumber = cellNumber;
    }

    public String writeToFile(char delim)
    {
        String output = firstName + delim;
        output += middleName + delim;
        output += lastName + delim;
        output += nickName + delim;
        output += age + delim;
        output += emailAddress + delim;
        output += cellNumber;

        return output;

    }

}
