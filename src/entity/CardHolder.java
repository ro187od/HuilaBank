package entity;

public class CardHolder {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public CardHolder(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
