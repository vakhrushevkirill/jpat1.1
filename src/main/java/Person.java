public class Person {

    private String name;
    private String lastName;
    private int age = 0;
    private String address;

    public Person(){

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int happyBirthday(){
        this.age += 1;
        return this.age;
    }

    public boolean hasAge(){
        if (this.age > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress(){
        if (this.address != null){
            return true;
        } else {
            return false;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.lastName)
                .setAddress(this.address)
                .setAge(0);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
