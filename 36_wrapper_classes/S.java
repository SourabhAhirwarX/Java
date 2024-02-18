class A {
    static Number incrementFunc(Number obj) {
        Number x = null;
        if(obj instanceof Byte) {
            byte tmp = obj.byteValue();
            tmp++;
            x = Byte.valueOf(tmp);
        } else if(obj instanceof Short) {
            short tmp = obj.shortValue();
            tmp++;
            x = Short.valueOf(tmp);
        }

        return x;
    }    
}