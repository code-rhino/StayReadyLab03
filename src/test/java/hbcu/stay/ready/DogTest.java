package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;


public class DogTest {

   @Test
   public void setName() {
        //Given (a name exists and a dog exists)
        Dog dog = new Dog("Pablo", new Date(), 01);
        String expected = "Milo";

        //When (a dog's name is set to the given name)
        dog.setName(expected);
        String actual = dog.getName();

        //Then (we expect to get the given name from the dog)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        //Given
        Dog dog =  new Dog("Caramel", new Date(), 02);
        String expected = "bark!";
        //When
        dog.speak();
        String actual = dog.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        //Given
        Dog dog = new Dog("Tiger", new Date(), 03);
        Date expected = new Date(03-22-2015);
        //When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eat() {
        //Given
        Dog dog = new Dog("Snow", new Date(), 04);
        Food chicken = new Food();
        Food tuna = new Food();
        int expected = 2;

        //When
        dog.eat(chicken);
        dog.eat(tuna);
        int actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getId() {
        //Given
        Dog dog = new Dog("Puma", new Date(), 05);
        int expected = 05;

        //When
        int actual = dog.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritance() {
        //Given
        Dog dog = new Dog("Juniper", new Date(), 06);
        boolean expected = true;

        //When
        boolean actual = (dog instanceof Animal);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void mammalInheritance() {
        //Given
        Dog dog = new Dog("Juniper", new Date(), 06);
        boolean expected = true;

        //When
        boolean actual = (dog instanceof Mammal);

        //Then
        Assert.assertEquals(expected, actual);
    }

}  
   
