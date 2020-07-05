package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test 
    public void createDog() {
        //Given
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog("Lulu", birthDate);
        
        String expectedName = "Lulu";
        Date expectedDate = birthDate;

        //When
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);

    }

    @Test
    public void createCat() {
        //Given
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat("Tiger", birthDate);
        
        String expectedName = "Tiger";
        Date expectedDate = birthDate;

        //When
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
