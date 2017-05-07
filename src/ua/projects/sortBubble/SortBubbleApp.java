package ua.projects.sortBubble;

/**
 * Created by alex on 07.05.2017.
 */
public class SortBubbleApp {

    public void execute(){
        int[] array = new int[10];

        array = fillArray(array);
        output(array);

        array = sortBubble(array);
        output(array);
    }

    public int[] sortBubble(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]) {
                    a[j] = a[j] + a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                }
            }
        }
        return a;
    }

    public int[] fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        return a;
    }

    public void output(int[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
