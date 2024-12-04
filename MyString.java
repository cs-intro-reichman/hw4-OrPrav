public class MyString {
    public static void main(String[] args) {
        // System.out.println("Testing lowercase:");
        // System.out.println("UnHappy : " + lowerCase("UnHappy"));
        // System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        // System.out.println("TLV : " + lowerCase("TLV"));
        // System.out.println("lowercase : " + lowerCase("lowercase"));
        

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newString = "";
        for(int i=0; i<str.length() ;i++){
            char ch1 = (char) str.charAt(i);
            if (ch1 >= 65 && ch1 <= 90) {
                char ch2  = (char) ((char) ch1 + 32);
                newString = newString + ch2;
            }
            else{
                newString = newString + (ch1);
            }
        }
        return newString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            int index;
            for (index = 0; index < str2.length(); index++) {
                if (str1.charAt(i + index) != str2.charAt(index)) {
                    break; 
                }
            }
            if (index == str2.length()) { 
                return true;
            }
        }
        return false;
    }
    //Expected:%0ATesting 'lowerCase':%0APassed 3/3 tests (Passed)%0ATesting 'contains':%0APassed 5/5 tests (Passed)%0A
    //Actual:  %0ATesting 'lowerCase':%0A%0Aeasy peasy lemon squeezy%0Ai love infi and intro%0APassed 3/3 tests (Passed)%0ATesting 'contains':%0APassed 5/5 tests (Passed)


}
