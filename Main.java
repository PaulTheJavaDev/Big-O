public class Main {

    public static void main(String[] args) {

        /*
        here I will try my best to learn Big O which is essential for Coding interviews 
        and common nowledge for Algorithms and Datastructures
        */
            
        tries(new int[] {1, 2, 3, 4});

    }


    //Big O(N^3), because 3 loops
    public static int sumCharCodes(String n) {
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < n.length(); j++) {
                for (int k = 0; k < n.length(); k++) {
                    System.out.println(sum);
                    sum += n.charAt(i); // Add the ASCII value of the character
                }
            }
        }

        return sum;
    }

    //Big O(N^2), because 2 loops
    public static int sumCharCodes2(String n) {
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < n.length(); j++) {
                System.out.println(sum);
                sum += n.charAt(i); // Add the ASCII value of the character
            }
        }

        return sum;
    }

    //Big O(N), because 1 loop, N is the nums array
    public static int tries(int[] nums) {
        int tries = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            tries++;
        }

        return tries;
    }
}
