package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {

    @Test
    public void addCat() {
        CatHouse.clear();
        //Given
        Date birthDate = new Date();
        Cat cat = new Cat("Tiger", birthDate, 01);
        Cat cat2 = new Cat("Snow", birthDate, 02);
        int expectedCats = 2;

        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        int actualCats = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void idRemoveCat() {
        CatHouse.clear();
        //Given
        Date birthDate = new Date();
        Cat cat = new Cat("Tiger", birthDate, 01);
        Cat cat2 = new Cat("Snow", birthDate, 02);
        
        int expected = 1;

        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.remove(01);
        int actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void RemoveCat() {
        CatHouse.clear();
        //Given
        Date birthDate = new Date();
        Cat cat = new Cat("Tiger", birthDate, 01);
        Cat cat2 = new Cat("Snow", birthDate, 02);
        
        int expected = 1;

        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.remove(cat2);
        int actual = CatHouse.getNumberOfCats();


        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCatById() {
        CatHouse.clear();
        //Given
        Date birthDate = new Date();
        Cat cat = new Cat("Tiger", birthDate, 01);
        Cat cat2 = new Cat("Snow", birthDate, 02);
        
        Cat expected = cat2;

        //When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        Cat actual = CatHouse.getCatById(02);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberOfCats() {
        CatHouse.clear();
        //Given
        Date birthDate = new Date();
        Cat cat = new Cat("Tiger", birthDate, 01);
        int expectedCats = 1;

        //When
        CatHouse.add(cat);
        int actualCats = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCats, actualCats);
    }

    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }    
}
