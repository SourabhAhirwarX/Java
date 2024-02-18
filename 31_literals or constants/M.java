class A {
    public static void main(String[] args) {
        String x = "Lorem ipsum dolor sit amet consectetur adipisicing elit. \nVelit nemo repudiandae quos reiciendis quibusdam soluta omnis? \nAnimi corporis unde expedita culpa, ad nisi et, repudiandae nesciunt eveniet reprehenderit quos at!";
        System.out.println(x);
        
        String[] arr = x.split(" ");
        for(String s : arr) {
            System.out.println(s);
        }
    }
}