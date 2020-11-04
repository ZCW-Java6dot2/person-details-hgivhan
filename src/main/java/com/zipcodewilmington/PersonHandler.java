package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int i = 0;

        while (i < personArray.length) {
            Person current = personArray[i];
            result += current.toString();
            i++;
        }
        return result;
    }


    // create loop that takes the names and phrases and puts them together from Person Class
    // create a `counter`
    // while `counter` is less than length of array
    // begin loop

    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable

    // end loop


    public String forLoop() {
        String result = "";
        int i = 0;

        for (i = 0; i < personArray.length; i++) {
            Person current = personArray[i];
            result += current.toString();
        }
        return result;
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

    }


    public String forEachLoop() {
        String result = "";

        for (Person b : personArray){
            result += b;
        }

        return result;
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop





    public Person[] getPersonArray() {
        return personArray;

    }
}


