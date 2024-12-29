class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        String genderString = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderString + ".";
    }

    public static void main(String[] args) {
        Person person = new Person("Harry", "Potter", 21, true);
        System.out.println(person);

        Person anotherPerson = new Person("Hermione", "Granger", 19, false);
        System.out.println(anotherPerson);
    }
}


