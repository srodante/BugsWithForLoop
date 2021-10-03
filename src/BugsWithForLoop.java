public class BugsWithForLoop {
    public static void main (String[] argd){
        int sum = 0;

        for (int i = 8; i > 0; i -= 2){
            sum += i;
        }

        System.out.println("Sum= " + sum);
    }
}
