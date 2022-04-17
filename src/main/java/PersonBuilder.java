public class PersonBuilder{
    private Person person = null;

    public PersonBuilder(){
        this.person = new Person();
    }

    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        person.setLastName(surname);
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        } else {
            if (age == 0) {
                person.happyBirthday();
            } else{
                person.setAge(age);
            }
            return this;
        }
    }
    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    public Person build() {
        if (person.getName() == null){
            throw new IllegalStateException("Параметр name не передан");
        }
        if (person.getLastName() == null){
            throw new IllegalStateException("Параметр surname не передан");
        }
        if (!person.hasAddress()){
            throw new IllegalStateException("Параметр address не передан");
        }
        if (!person.hasAge()){
            throw new IllegalStateException("Параметр age не передан");
        }
        return person;
    }
}
