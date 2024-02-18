class A {
    public static void main(String[] args) {
        Student[][] x = new Student[2][];

        x[0] = new Student[] {
                                new Student("om1",12, new Address(new City("Jbp"), new State("MP"))),
                                new Student("om2",13, new Address(new City("bhp"), new State("MP")))
                            };

        x[1] = new Student[] {
                                new Student("om3",14, new Address(new City("nag"), new State("MH"))),
                                new Student("om4",15, new Address(new City("Kan"), new State("UP"))),
                                new Student("om5",16, new Address(new City("Ahm"), new State("GJ")))
                            };

        System.out.println(x[1][2].address.state.stateName);    // GJ
        System.out.println(x[0][1].address.city.cityName);      // bhp
        System.out.println(x[0][1].age);                        // 13
        System.out.println(x[1][1].address.city.cityName);      // kan

    }
}

class Student {
    String name;
    int age;
    Address address;    // HAS-A relationship

    Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class Address {
    City city;          // HAS-A relationship
    State state;

    Address(City city, State state) {
        this.city = city;
        this.state = state;
    }
}

class City {
    String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }
}

class State {
    String stateName;

    State(String stateName) {
        this.stateName = stateName;
    }
}