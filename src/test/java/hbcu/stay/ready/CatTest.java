package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;
import hbcu.stay.ready.animals.Cat;

import java.util.Date;


public class CatTest {
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setName() {
        //Given
        Cat cat = new Cat("Pablo", new Date(), 01);
        String expected = "Zeus";
        //When
        cat.setName("Zeus");
        String actual = cat.getName();
        //Then
        Assert.assertEquals("Testing set name of cat object",expected, actual);
    }

    @Test
    public void speak() {
        //Given
        Cat cat =  new Cat("Caramel", new Date(), 02);
        String expected = "meow!";
        //When
        cat.speak();
        String actual = cat.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        //Given
        Cat cat = new Cat("Tiger", new Date(), 03);
        Date expected = new Date(03-22-2015);
        //When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eat() {
        //Given
        Cat cat = new Cat("Snow", new Date(), 04);
        Food chicken = new Food();
        Food tuna = new Food();
        int expected = 2;

        //When
        cat.eat(chicken);
        cat.eat(tuna);
        int actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getId() {
        //Given
        Cat cat = new Cat("Puma", new Date(), 05);
        int expected = 05;

        //When
        int actual = cat.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritance() {
        //Given
        Cat cat = new Cat("Juniper", new Date(), 06);
        boolean expected = true;

        //When
        boolean actual = (cat instanceof Animal);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void mammalInheritance() {
        //Given
        Cat cat = new Cat("Juniper", new Date(), 06);
        boolean expected = true;

        //When
        boolean actual = (cat instanceof Mammal);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
