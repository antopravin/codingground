public class HelloWorld{
public  static boolean unique(String str){
    int checker =0;
    for(int i=0;i<str.length();i++){
        int position = str.charAt(i)-'a';
        if((checker &(1<<position)) > 0) return false;
        checker = checker |(1<<position);
    }
    return true;
}
     public static void main(String []args){
        System.out.println(unique("aanto"));
     }
}
