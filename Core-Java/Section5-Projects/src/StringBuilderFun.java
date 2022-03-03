public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kushagra Singhal");

        sb.append(" is Dexter");
        System.out.println(sb);

        sb.insert(9, "Kasa ");
        System.out.println(sb);

        sb.replace(25, 33, "amazing");
        System.out.println(sb);

        sb.delete(9,13);
        System.out.println(sb);

        sb.replace(0,9, "Dr.");
        System.out.println(sb);

    }//end main
}
