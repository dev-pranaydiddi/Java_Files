package Practice_3;

public class CaseConversion {

    public static void main(String[] args) {
        String str = "Hi";
        StringBuilder st = new StringBuilder();
        for(char ch : str.toCharArray()){
            if (Character.isLowerCase(ch) ){
                st.append(Character.toUpperCase(ch) );
            }
            else{
                st.append(Character.toLowerCase(ch) );
            }
        }

        System.out.println(st.toString());
        
   }
}
//alternate without using ascii codes

//
//package Practice_3;
//
//public class CaseConversion {
//
//    public static void main(String[] args) {
//        String str = "Hi";
//        StringBuilder st = new StringBuilder();
//        for(char ch : str.toCharArray()){
//            if (ch>='A' && ch<='Z' ){
//                st.append((char)(ch+32));
//            }
//            else{
//                st.append((char)(ch-32));
//            }
//        }
//        char ch = 'a';
//        System.out.println(st.toString());
//        System.out.println('A'+0);
//    }
//}
