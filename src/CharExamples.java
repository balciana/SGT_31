public class CharExamples {
    public static void main(String[] args) {

        char ch = 'M';
        System.out.println(ch);

        ch++;
        System.out.println(ch);

        //cast from int to char
        System.out.println((char) 122);

        //print out all lower case alphabet letters
        char cha = 97;
        while (cha <=122){
            System.out.print(cha + " ");
            cha++;
        }
    }
}
