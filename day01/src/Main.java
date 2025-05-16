public class Main {
    public static void main(String[] args) {
        String name = "Alexandre";
        int number = 0;
//        Iterando através do laço for
//        for(int i = 0; i < name.length(); i++) {
//            System.out.println(name.charAt(i));
//        }
        while (number < name.length()) {
            System.out.println(name.charAt(number));
            number++;
        }

    }
}