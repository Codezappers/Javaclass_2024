/**public class Table1 {
    public static void main(String[] args) {
        int tableno = 5;
        int i = 0;
        i = 10;
        while ( i >0 )
            System.out.println(tableno + "*" + (i) + "=" + tableno * (i));
        i--;
    }

}
**/
/**public class Table1 {
    public static void main(String[] args) {
        int tableno = 5;
        int i = 0;
        i = 10;
        do {
            System.out.println(tableno + "*" + (i) + "=" + tableno * (i));
            i--;

        }
        while (i > 0) ;

    }

}
**/
/**public class Table1 {
    public static void main(String[] args) {
        int tableno = 5;
        int i = 0;
        i = 9;
        do {
            System.out.println(tableno + "*" + (i) + "=" + tableno * (i));
            i--;
        }
        while (i < 3) ;

    }

}**/

//Ask the user where to start from
// where to stop
//ask for table number
//ascending or desc
/**import java.util.Scanner;

public class Table1 {
    public static void main (String[] args){
        int tableno = 5;
        int i = 0;
        System.out.println("input the table number : ");
        Scanner sc = new Scanner(System.in);
        tableno= sc.nextInt();

        System.out.println("input the table number: ");
        sc = new Scanner(System.in);
        int start = sc.nextInt();

        System.out.println("input the table number: ");
        sc = new Scanner(System.in);
        int stop = sc.nextInt();

        i = start;

        do {
            System.out.println(tableno + "*" + (i) + "=" + tableno * (i));
            i--;

        }
        while (i >= stop -1) ;

    }
}**/
/**
 import java.util.Scanner;

 public class Table1 {
 public static void main (String[] args){
 int tableno = 5;
 int i = 0;
 System.out.println("input the table number : ");
 Scanner sc = new Scanner(System.in);
 tableno= sc.nextInt();

 System.out.println("input the table number: ");
 sc = new Scanner(System.in);
 int start = sc.nextInt();

 System.out.println("input the table number: ");
 sc = new Scanner(System.in);
 int stop = sc.nextInt();

 System.out.println("Please enter 'a' for ascending and 'd' for  descending ");
 char c = sc.next (),charAt(0);

 if (c=='d')
 {
 i = start;

 do {
 System.out.println(tableno + "* " + (i) + "=" + tableno * (i));
 i--;

 }
 else if (i >= stop -1) ;
 {

 }

 }
 /**
 *
 */







