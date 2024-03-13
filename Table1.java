public class Table1 {
    public static void main(String[] args) {
        int tableno = 5;
        int increment = 0;

        for (increment = 0; increment < 10; increment+=1)
            System.out.println(tableno + "*" + (increment+1) + "=" + tableno * (increment + 1));

    }

}