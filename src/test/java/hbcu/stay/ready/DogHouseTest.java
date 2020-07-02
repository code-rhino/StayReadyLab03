package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest
{
    @Test
    public void testAdd()
    {
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();
        dogHouse.add(new Dog("Bubba", new Date(), 23));
        dogHouse.add(new Dog("Skeir", new Date(), 52));

        Integer i = 2;
        Assert.assertEquals(i, dogHouse.getNumberOfDogs());
    }


    @Test
    public void testRemoveId()
    {
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();

        Dog d = new Dog("bleep", new Date(), 2);
        dogHouse.add(d);
        Integer sizePrev = dogHouse.getNumberOfDogs();
        dogHouse.remove(2);
        Integer postSize = dogHouse.getNumberOfDogs();

        boolean sizeNotEqual = sizePrev != postSize;

        Assert.assertEquals(true, sizeNotEqual);
    }
    @Test
    public void testRemoveDog()
    {
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();

        Dog d = new Dog("asdklkj", new Date(), 24);
        dogHouse.add(d);

        Integer size = dogHouse.getNumberOfDogs();
        Assert.assertEquals(new Integer(1), size);
        dogHouse.remove(d);
        Integer newSize = dogHouse.getNumberOfDogs();
        Assert.assertEquals(new Integer(0), newSize);
        boolean sizeNotEqual = size != newSize;

        Assert.assertEquals(true, sizeNotEqual);
    }
    @Test
    public void getDogTest()
    {
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();

        Dog d = new Dog("askdlkj", new Date(), 234);
        dogHouse.add(d);

        String dogName = dogHouse.getDogById(234).getName();

        Assert.assertEquals("askdlkj", dogName);
    }

    @Test
    public void getNumberDogsTest()
    {
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();

        Dog d = new Dog("asdlkjfd", new Date(), 23465);
        dogHouse.add(d);

        Assert.assertEquals(new Integer(1), dogHouse.getNumberOfDogs());
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
