package seedu.addressbook.data.person.AddressDetails;


/**
 * Represents a Person's address street in the address book.
 */
public class Street {

    private String value;

    public Street(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
