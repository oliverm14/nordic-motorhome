package Model;//Magnus Svendsen DAT16i

import java.time.LocalDate;

public class SalesAssistant extends Employee
{

    public SalesAssistant(String name, String cpr, LocalDate dateOfBirth, String address, int phoneNumber, String email)
    {
        super(name, cpr, dateOfBirth, address, phoneNumber, email);
    }

}
