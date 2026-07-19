class palindrome {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}