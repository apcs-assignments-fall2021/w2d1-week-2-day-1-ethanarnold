public class MyMain {
    // Takes two Strings as input, and returns a String equal to the first half
    // of the shorter String plus the second half of the longer String.
    public static String halfAdder(String str1, String str2) {
        if(str1.length()>str2.length()) {
            return str2.substring(0,str2.length()/2)+str1.substring(str1.length()/2);
        }
        return str1.substring(0,str1.length()/2)+str2.substring(str2.length()/2);
    }

    // Takes a String as input, and returns true if the String contains an 'A' or 'a'
    // and returns false otherwise
    public static boolean checkIfA(String str) {
        //return(str.contains('A') || str.contains('a'))

        for(int i = 0; i<str.length()-1; i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='A') return true;
        }
        return false;
    }

    //  Takes in two Strings as input and returns a String equal to those two Strings added
    //  together in alphabetic order.
    public static String stringOrder(String str1, String str2) {
        if(str2.compareToIgnoreCase(str1)>=0) {
            return str1 + str2;
        }
        return str2+str1;
    }



    public static void main(String[] args) {
        // Some code to test halfAdder
        System.out.println("halfAdder tests:");
        System.out.println(halfAdder("computer","science")); // sciuter
        System.out.println(halfAdder("apple","fig")); // fple
        System.out.println(halfAdder("banana","boat")); // boana
        System.out.println(halfAdder("crablike","pineapple")); // crabapple
        System.out.println(halfAdder("trombone", "hippie")); // hipbone

        // Some code to test checkIfA
        System.out.println("\ncheckIfA tests:");
        System.out.println(checkIfA("asdf")); // true
        System.out.println(checkIfA("bAnAnA")); // true
        System.out.println(checkIfA("fig")); // false

        // Some code to test stringOrder
        System.out.println("\nstringOrder tests:");
        System.out.println(stringOrder("apple", "banana")); // applebanana
        System.out.println(stringOrder("banana", "apple")); // applebanana
        System.out.println(stringOrder("cranberry", "banana")); // bananacranberry
        System.out.println(stringOrder("apple", "Banana")); // appleBanana
        System.out.println(stringOrder("Cranberry", "apple")); // appleCranberry
        System.out.println(stringOrder("Cranberry", "Craple"));
    }
}