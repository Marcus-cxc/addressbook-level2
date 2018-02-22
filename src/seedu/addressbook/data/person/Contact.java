package seedu.addressbook.data.person;

/**
 * Parent class of Address, Email and Phone
 *
 */
public abstract class Contact {

    public final String value;
    private boolean isPrivate;

    public Contact(String value,boolean isPrivate){
        this.value = value.trim();
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public abstract boolean equals(Object other);

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
