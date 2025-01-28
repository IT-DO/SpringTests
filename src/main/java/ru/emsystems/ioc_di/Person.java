package ru.emsystems.ioc_di;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;

    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Pet getPet() {
        return pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely Pet!");
        this.pet.say();
    }


    public Person(){
        System.out.println("Person bean is created");
    }

    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet=pet;
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet){
//        System.out.println("Person bean is created");
//        this.pet=pet;
//    }
//    @Autowired
    public void setPet(Pet pet){
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurname(){
        return surname;
    }

}
