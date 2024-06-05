public class OutTer {
    int x = 3 ; 
   class innTer {
    public int myInnTer(){
        return x = 4; 
    }
       

    }
    public static void main(String[] args) {
        OutTer my = new OutTer();
        OutTer.innTer myTest = my.new innTer(); 
        System.out.println(myTest.myInnTer()); 
    }
}
