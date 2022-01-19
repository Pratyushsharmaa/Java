// Take nos from 1-1000 both inclusive.
//sum those which are divisible by 3 and 5. stop when loop runs five times.
//print numbers and their sum.




public class main {
    public static void main(String[] args) {
int count = 0;
int sum = 0;
for(int i=1;i<=1000;i++) {
    if ((i % 3 == 0) && (i % 5 == 0)) {
        count++;
        sum += i; // sum of whatever we printed
        System.out.println("Found number = " + i);

    }
    if (count == 5) {
        break;
    }
}
    System.out.println("Sum = " + sum);

    }
}
