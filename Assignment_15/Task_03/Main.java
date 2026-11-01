// Print all arrangements of the letters x and y, one per line.
// Using a used[] array; pick a letter that is not used, mark it used, fill the next position, then unmark it.

public class Main {
    static char[] letters = {'x', 'y'};
    static boolean[] used = new boolean[letters.length];
    static char[] result = new char[letters.length];

    static void arrange(int position) {
        if (position == letters.length) {
            System.out.println(new String(result));
            return;
        }

        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[position] = letters[i];
                arrange(position + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        arrange(0);
    }
}
