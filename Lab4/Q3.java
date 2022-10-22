public class Q3 {
        public static void main(String[] args) {
            String s=new String("Mississppi");
            s=s.replace("i","!");
            s=s.replace("s","$");
            System.out.println("The expected word is M!$$!$$pp!");
            System.out.println("The word after encoding:"+s);
        }

}
