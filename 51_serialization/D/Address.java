class Address  implements java.io.Serializable {
    City city;
    State state;
    
    Address(City city, State state) {
        this.city = city;
        this.state = state;
    }
}