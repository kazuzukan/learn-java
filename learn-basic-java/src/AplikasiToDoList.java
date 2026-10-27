public class AplikasiToDoList {
    /**
        1. List
        2. Tambah
        3. Hapus
     **/

    // Array Data
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
       // testShowToDoList();
       // testAddToDoList();
        // testRemove();
        // testInput();

        // VIEW Test
        // testViewToDoList();
        // testViewAddToDoList();
        // testViewDeleteToDoList();

        // View
        viewShowToDoList();
    }

    /**
        LOGIC BUSINESS
     */
    public static void showToDoList() {
        System.out.println("TO DO List");
        for (int i = 0; i < model.length; i++) {
            String toDo = model[i];
            if (toDo != null) {
                System.out.println(i+1 + ". " + model[i]);
            }
        }
    }


    public static void addToDoList(String name) {
        // check to do list
        boolean isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model == null) {
                isFull = false;
                break;
            }
        }

        // Check full array
        if (isFull) {
            String[] temp = model;
            model = new String[model.length * 2];
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // Add to do list
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = name;
                break;
            }
        }
    }

    public static boolean deleteToDoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number-1] == null) {
            return false;
        }

        // model[number-1] = null;
        // Shifting to do
        for (int i = (number-1); i < model.length; i++) {
            if (i == (model.length) -1 ) {
                model[i] = null;
            } else {
                model[i] = model[i + 1];
            }
        }
        return true;
    }

    /**
     TEST
     */
    public static void testShowToDoList() {
        model[0] = "Belajar Java Basic";
        model[1] = "Belajar Java OOP";

        showToDoList();
    }

    public static void testAddToDoList() {
        for (int i = 0; i < 25 ; i++) {
            addToDoList("To DO Ke - " + i);
        }

        showToDoList();
    }

    public static void testRemove() {
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");

        System.out.println(deleteToDoList(20));
        System.out.println(deleteToDoList(4));
        System.out.println(deleteToDoList(1));

        showToDoList();
    }

    /**
        VIEW LOGIC
     */

    public static String input(String info) {
        System.out.print(info + ": ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var nama = input("Nama");
        System.out.println("Hi " + nama);
    }

    public static void viewShowToDoList() {
        while (true) {
            showToDoList();

            System.out.println("-- MENU ---");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            System.out.println();

            var input = input("Pilih");
            if (input.equals("1")) {
                viewAddToDoList();
            } else if (input.equals("2")) {
                viewDeleteToDoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Invalid Mass");
            }
        }
    }

    public static void viewAddToDoList() {
        System.out.println("Menambahkan To Do List");

        var todo = input("To Do");
        if (todo.equals("x")) {
            // batal
        } else {
            addToDoList(todo);
        }
    }

    public static void viewDeleteToDoList() {
        System.out.println("Menghapus To Do List");
        showToDoList();

        var number = input("Nomo yang dihapus");
        if (number.equals("x")) {
            // batal
        } else {
           boolean successDelete = deleteToDoList(Integer.valueOf(number));
           if (!successDelete) {
               System.out.println("Gagal menghapus to do list : " + number);
           }
        }
    }

    /**
     VIEW TEST
     */

    public static void testViewToDoList() {
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");

        viewShowToDoList();
    }

    public static void testViewAddToDoList() {
        addToDoList("Satu");
        addToDoList("Dua");

        viewAddToDoList();
        showToDoList();
    }

    public static void testViewDeleteToDoList() {
        addToDoList("Satu");
        addToDoList("Dua");

        viewDeleteToDoList();
    }

}


