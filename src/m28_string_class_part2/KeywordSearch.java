package m28_string_class_part2;

public class KeywordSearch {
    public static void main(String[] args) {

        String text = "Code without tests is broken by design.";
        String keyword = "DESIGN";

        boolean r = containsKeyword(text, keyword);

        System.out.println(r);                    //true

        String result = "        ";

        System.out.println(result.isEmpty());     //false
        System.out.println(result.isBlank());     //true

    }

    public static boolean containsKeyword(String text, String keyword) {
        // text = text.toLowerCase();
        // keyword = keyword.toLowerCase();

        return text.toLowerCase().contains(keyword.toLowerCase());
    }
}
