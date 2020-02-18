public class StringExamples {
    public String reverseRecursive(String myString) {
        String left;
        String right;

        int length = myString.length();
        if (length <= 1)
            return myString;

        left = myString.substring(0, length / 2);
        right = myString.substring(length / 2, length);

        return reverseRecursive(right) + reverseRecursive(left);
    }

    public String revers1(String myString) {
        char[] chars = myString.toCharArray();
        String resultString = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            resultString += String.valueOf(chars[i]);
        }
        return resultString;
    }

    public String revers2(String myString) {
        return new StringBuffer(myString).reverse().toString();
    }

    public String revers3(String myString) {
        String resultString = "";
        for (int i = myString.length() - 1; i >= 0; i--) {
            resultString += myString.charAt(i);
        }
        return resultString;
    }
}
