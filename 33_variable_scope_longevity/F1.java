class X {
    static int x = 45;
}
 
class A extends X {     
    void pro() {
         
        if(12<13) {            
            System.out.println(x);  
 
            for(int i=0; i<3; i++) {  // i is a block level variable                
 
                while(i<2) {                   
                    System.out.println(x);
                    i++;
                }
 
                System.out.println(x); 
            }
        }
        System.out.println(x); 
    }
 
    public static void main(String[] args) {
        A a = new A();
        a.pro();
    }
}