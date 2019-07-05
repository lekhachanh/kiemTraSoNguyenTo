public class CheckNum {
    public static boolean checkNum(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i =0 ; i<100; i++) {
            if (checkNum(i)) {
                System.out.println(i);
            }
        }
    }

}