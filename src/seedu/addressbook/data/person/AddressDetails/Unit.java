package seedu.addressbook.data.person.AddressDetails;


/**
 * Represents a Person's address unit in the address book.
 */
public class Unit {

    private String value;

    public Unit(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
