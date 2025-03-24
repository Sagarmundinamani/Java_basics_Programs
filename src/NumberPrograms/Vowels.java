package NumberPrograms;

public class Vowels {
    public static void main(String[] args) {
       char i='9';
       if((i=='a'||i=='e'||i=='i'||i=='o'||i=='u')||(i=='A'||i=='B'||i=='I'||i=='O'||i=='U')){
               System.out.println(i+"vowel");

           }else if((i>'a' &&i<'z')&&(i>'A'&& i<'Z')){
               System.out.println(i+"consonents");
           } else if (i>='0'&&i<='9') {
           System.out.println(i+"number");

       } else{
               System.out.println(i+"specialChar");
           }

    }
}
