package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Faisal";
        char target = 'f';
        System.out.println(search(name, target));
        //System.out.println(search2(name, target));
    }

    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        // converts both target and characters in the string to lowercase
        char lowercaseTarget = Character.toLowerCase(target);


        for (int i = 0; i < str.length(); i++) {
            if (lowercaseTarget == Character.toLowerCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }


    // iterating to the Array
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        char lowercaseTarget = Character.toLowerCase(target);

        for (char ch : str.toCharArray()) {
            if (lowercaseTarget == Character.toLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }
}
