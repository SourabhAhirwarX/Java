// we can mark a class as final but after that we can't make its child classes.
// i.e it can not be specialized further

/*final*/ class X {

}

class A extends X {

}

// error: cannot inherit from final X
