package ru.emsystems.ioc_di;

//import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat Bean is created");
    }

    public void say(){
        System.out.println("Mew-mew");
    }

}
