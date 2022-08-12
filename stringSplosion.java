
// // Given a non-empty string like "Code" return a string like "CCoCodCode".
// // stringSplosion("Code") → "CCoCodCode"
// // stringSplosion("abc") → "aababc"
// // stringSplosion("ab") → "aab"

// import java.util.*;

// class stringSplosion {
    
// public static String stringSplosion(String str) {
//     String result = "";
//     String residue = "";
    
//     // use string builder class
    
//     for(int i=0; i<str.length(); i++){
//       residue = str.substring(0, i + 1);
//       result = result + residue;
//     }
    
//     return result;
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next(); 
//         String result = stringSplosion(s);
//         System.out.print(result);
//         sc.close();
//     }
// }