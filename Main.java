

public class Main {
    public static void main(String[] args) {

        Add add = ((int a, int b) -> {
            int sum = 0;
            for(int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        });

        System.out.println(add.add(3, 5));
    }
}
