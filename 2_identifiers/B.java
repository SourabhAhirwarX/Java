// illegal identifiers 

/*  
    Rule: 2
        characters other than _, $ used as identifiers are invalid characters
*/

class A#^_23 {
    void %@*() {
        int max age = 20;
        int ~'' = 34; 
        int _5 = 6;
    }
}