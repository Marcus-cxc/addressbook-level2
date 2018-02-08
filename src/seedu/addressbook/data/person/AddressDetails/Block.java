package seedu.addressbook.data.person.AddressDetails;


/**
 * Represents a Person's address block in the address book.
 */
public class Block {

    private String value;

    public Block(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
