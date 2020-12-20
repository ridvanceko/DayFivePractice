package HomeWork5;

public class TaskTwo {

    public static void main(String [] args) {

        String snicker = "Snicker";
        System.out.println(snicker.trim().toUpperCase().substring(1,6).charAt(1));

        String cookie = "Cookie";
        System.out.println(cookie.toLowerCase().replace("ok", "u").concat(" vanilla"));

        //in replacement method if there is two the same letter "oo" if you want to change only one of them
        //you have to change one of them you have to provide either one after letter or before...
    }
}

//Please use method chaining for the following Strings. Methods are provided
//next to the String.
//String “ Snicker “; —> trim, toUpperCase, substring and charAt methods
//String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’
//, concat with ’s’
//, starts
//with ‘C’