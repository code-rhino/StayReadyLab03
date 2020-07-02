package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest
{

    @Test
    public void testSetName()
    {

        String desiredName = "Bubba";

        String name = "Sanders";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        Cat cat = new Cat(name, givenBirthDate, givenId);
        cat.setName("Bubba");

        Assert.assertEquals(desiredName, cat.getName());
    }

    @Test
    public void testSpeak()
    {
        String desiredName = "asdf";
        Date birthDate = new Date();
        Integer givenId =  2;

        Cat cat = new Cat(desiredName, birthDate, givenId);

        Assert.assertEquals("meow!", cat.speak());
    }

    @Test
    public void testBirthDate()
    {
        Cat cat = new Cat("Billy", new Date(), 3);
        Assert.assertEquals(new Date(), cat.getBirthDate());
    }

    @Test
    public void testEat()
    {
        Cat cat = new Cat(null, null, null);
        // given
        int expectedNumMeals = 1;
        Food chowMix = new Food();
        //when
        cat.eat(chowMix);
        int actualNumMeals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumMeals, actualNumMeals);
    }


    @Test
    public void testId()
    {
        Cat cat = new Cat("Spongebob", new Date(), 5);

        Integer id = 5;
        Assert.assertEquals(id, cat.getId());
    }

    @Test
    public void animalTest()
    {
        Cat cat = new Cat("Patrick", new Date(), 6);
        boolean isInstance = cat instanceof Animal;

        Assert.assertEquals(true, isInstance);
    }
    @Test
    public void mammalTest()
    {
        Cat cat = new Cat("Squidward", new Date(), 7);
        boolean isInstance = cat instanceof Mammal;

        Assert.assertEquals(true, isInstance);
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
