package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;


public class DogTest {
    @Test
    public void newDogTest()
    {
        Dog dog = new Dog("Garfield", new Date(), 8);

        String getName = "Garfield";
        Date getDate = new Date();
        Integer getId = 8;

        Assert.assertEquals(getName, dog.getName());
        Assert.assertEquals(getDate, dog.getBirthDate());
        Assert.assertEquals(getId, dog.getId());

    }
    @Test
    public void testSpeak()
    {
        Dog dog = new Dog(null, null, null);
        Assert.assertEquals("bark!", dog.speak());
    }
    @Test
    public void testBirthDate()
    {
        Dog dog = new Dog(null, new Date(), null);

        Date date = new Date();
        Assert.assertEquals(date, dog.getBirthDate());
    }

    @Test
    public void testEat()
    {
        Dog dog = new Dog(null, null, null);
        // given
        int expectedNumMeals = 1;
        Food dogFood = new Food();
        //when
        dog.eat(dogFood);
        int actualNumMeals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumMeals, actualNumMeals);
    }
    @Test
    public void testId()
    {
        Dog dog = new Dog(null, null, 10);
        Integer id = 10;

        Assert.assertEquals(id, dog.getId());
    }
    @Test
    public void testAnimal()
    {
        Dog dog = new Dog(null, null, null);
        boolean isInherit = dog instanceof Animal;

        Assert.assertEquals(true, isInherit);
    }
    @Test
    public void testMammal()
    {
        Dog dog = new Dog(null, null, null);
        boolean isInherit = dog instanceof Mammal;

        Assert.assertEquals(true, isInherit);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
