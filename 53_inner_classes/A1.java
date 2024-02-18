class A {
    // Anonymous Inner Class\
    // An inner class of class A
    // and a sub class of interface Z
    static Z t = new Z() {
        public void pro() {
            System.out.println("HIIIII....");
        }
    };

    public static void main(String[] args) {
        t.pro();
    }
}

interface Z {
    void pro();
}

// class T implements Z {
//     public void pro() {
//         System.out.println("Hi");
//     }
// }