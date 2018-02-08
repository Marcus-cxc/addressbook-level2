package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS =
            "Person addresses has to be entered by a/ BLOCK, STREET, UNIT, POSTAL CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private static String block;
    private static String street;
    private static String unit;
    private static String postal;

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = trimmedAddress;


    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        ArrayList<String> separatedFormat = splitByComma(test);
        if(separatedFormat.size() == 4) {
            block = separatedFormat.get(0).trim();
            street = separatedFormat.get(1).trim();
            unit = separatedFormat.get(2).trim();
            postal = separatedFormat.get(3).trim();
            return true;
        }
        else
        {
            return false;
        }

    }


    /**
     * Splits a source string into the list of substrings that were separated by comma.
     *
     * @param toSplit source string
     * @return split by whitespace
     */
    private static ArrayList<String> splitByComma(String toSplit) {
        return new ArrayList<>(Arrays.asList(toSplit.trim().split(",")));
    }




    @Override
    public String toString() {
        return block + ", " + street + ", " + unit + ", " + postal;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
