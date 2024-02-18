class X {

}

class Y {

}

class A extends X, Y {

}

// *Multiple class inheritance is not applicable
// error: '{' expected 

// java doesn't support multiple class inheritance because of diamond problem
// while accessing ambiguous data
// so for this we have the interfaces.