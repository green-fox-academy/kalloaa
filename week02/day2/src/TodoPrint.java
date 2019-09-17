public class TodoPrint {
    public static void main(String... args) {
        String todoText = " - Buy milk\n ";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indentation

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        todoText = addStr(todoText, "My todo: \n ", 0);
        todoText = addStr(todoText, " \n - Download games \n ", todoText.lastIndexOf(" "));
        todoText = addStr(todoText, "    - Diablo", todoText.lastIndexOf(" "));
        System.out.println(todoText);

    }

    public static String addStr(String str, String strAdded, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, strAdded);
        return sb.toString();
    }
}