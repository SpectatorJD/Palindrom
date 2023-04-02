public class Main {

    public static void main(String[] args) {
        System.out.println(getPalindorm ("Топтать"));

    }
      public static boolean getPalindorm (String word){
        String w1 = word.toUpperCase();
        StringBuffer w2=new StringBuffer(w1).reverse();
        boolean check = true;
          for (int i = 0; i <w1.length() ; i++) {
              if (w1.charAt(i)!= w2.charAt(i)){
                  check=false;
                  break;
              }
          }
        return check;
      }
}
