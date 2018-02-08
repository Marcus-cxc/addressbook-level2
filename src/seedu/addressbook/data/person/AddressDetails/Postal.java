package seedu.addressbook.data.person.AddressDetails;


/**
 * Represents a Person's address postal in the address book.
 */
public class Postal {

    private String value;

    public Postal(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
