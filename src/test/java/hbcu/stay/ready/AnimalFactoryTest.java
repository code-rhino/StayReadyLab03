package hbcu.stay.ready;

import static org.junit.Assume.assumeNoException;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest
{
    @Test
    public void createDogTest()
    {
        Dog d = AnimalFactory.createDog("Bubba", new Date());
        String name = "Bubba";

        Assert.assertEquals(name, d.getName());
    }
    public void createCatTest()
    {
        Cat c = AnimalFactory.createCat("Booger", new Date());
        String name = "Booger";

        Assert.assertEquals(name, c.getName());
    }
}
