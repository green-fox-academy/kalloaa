public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        quote= addStr(quote,"always takes longer than ",quote.indexOf("you"));
        System.out.println(quote);
    }
    public static String addStr(String str, String strAdded, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, strAdded);
        return sb.toString();
    }
}