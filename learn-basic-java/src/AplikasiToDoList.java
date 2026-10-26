public class AplikasiToDoList {
    /**
        1. List
        2. Tambah
        3. Hapus
     **/

    // Array Data
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowToDoList();
    }

    /**
        LOGIC BUSINESS
     */
    public static void showToDoList() {
        for (int i = 0; i < model.length; i++) {
            String toDo = model[i];
            if (toDo != null) {
                System.out.println(i+1 + ". " + model[i]);
            }
        }
    }


    public static void addToDoList(String name) {

    }

    public static void deleteToDoList(String name) {

    }

    /**
     TEST
     */
    public static void testShowToDoList() {
        model[0] = "Belajar Java Basic";
        model[1] = "Belajar Java OOP";

        showToDoList();
    }

    /**
        VIEW LOGIC
     */

    public static void viewShowToDoList() {

    }

    public static void viewAddToDoList() {

    }

    public static void viewDeleteToDoList() {

    }
}


