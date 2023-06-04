public class ManipulatingString {
    public static String removeNonAlphanumeric(String string) {
        String cleanedString = string.replaceAll("[^a-z0-9]", "");
        return cleanedString;
    }
    public static void main(String[] args) {
        String inputString = "Hello!123$";
        String cleanedString = removeNonAlphanumeric(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);
    }
}