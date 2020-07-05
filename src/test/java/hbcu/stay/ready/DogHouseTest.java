package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addDog() {
        DogHouse.clear();
        //Given
        Date birthDate = new Date();
        Dog dog = new Dog("Tiger", birthDate, 01);
        Dog dog2 = new Dog("Snow", birthDate, 02);
        int expectedDogs = 2;

        //When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        int actualDogs = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void idRemoveDog() {
        DogHouse.clear();
        //Given
        Date birthDate = new Date();
        Dog dog = new Dog("Tiger", birthDate, 01);
        Dog dog2 = new Dog("Snow", birthDate, 02);
        
        int expected = 1;

        //When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.remove(01);
        int actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void RemoveDog() {
        DogHouse.clear();
        //Given
        Date birthDate = new Date();
        Dog dog = new Dog("Tiger", birthDate, 01);
        Dog dog2 = new Dog("Snow", birthDate, 02);
        
        int expected = 1;

        //When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.remove(dog2);
        int actual = DogHouse.getNumberOfDogs();


        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogById() {
        DogHouse.clear();
        //Given
        Date birthDate = new Date();
        Dog dog = new Dog("Tiger", birthDate, 01);
        Dog dog2 = new Dog("Snow", birthDate, 02);
        
        Dog expected = dog2;

        //When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        Dog actual = DogHouse.getDogById(02);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberOfDogs() {
        DogHouse.clear();
        //Given
        Date birthDate = new Date();
        Dog dog = new Dog("Tiger", birthDate, 01);
        int expectedDogs = 1;

        //When
        DogHouse.add(dog);
        int actualDogs = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDogs, actualDogs);
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
