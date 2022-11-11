public class GoodString {
    public static String makeGood(String s) {

        boolean goodString = isGoodString(s);
        String newString = s;

        while(!goodString) {
            newString = cleanString(newString);
            goodString = isGoodString(newString);
        }

        return newString;

    }

    public static String cleanString(String s) {

        StringBuilder sb = new StringBuilder(s);

        int indexToErase=0;
        for(int i=0; i<sb.length(); i++) {
            char currentChar = sb.charAt(i);
            char nextChar = sb.charAt(i + 1);

            if ((Character.toLowerCase(currentChar) == Character.toLowerCase(nextChar))
                    && ((Character.isUpperCase(currentChar) && Character.isLowerCase(nextChar))
                    || (Character.isLowerCase(currentChar) && Character.isUpperCase(nextChar)))) {

                indexToErase=i;
                break;
            }
        }

        sb.delete(indexToErase, indexToErase + 2);

        return sb.toString();
    }

    public static boolean isGoodString(String s) {
        boolean isGood = true;

        for (int i = 0; i < s.length() - 1; i++) {

            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);

            if ((Character.toLowerCase(currentChar) == Character.toLowerCase(nextChar))) {
                if ((Character.isUpperCase(currentChar) && Character.isLowerCase(nextChar))
                        || (Character.isLowerCase(currentChar) && Character.isUpperCase(nextChar))) {

                    isGood = false;
                    break;
                }
            }
        }
        return isGood;
    }
}
