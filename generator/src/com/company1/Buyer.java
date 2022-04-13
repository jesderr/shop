package com.company1;

public class Buyer {

    public Long id;
    public String name;
    public String surname;
    public String gender;
    public int bankCardId;

    @Override
    public String toString() {
        return String.format("Id = %o, name = %s, surname = %s,  gender = %s, bankCardId = %o",
                this.id, this.name, this.surname, this.gender, this.bankCardId);
    }
}
