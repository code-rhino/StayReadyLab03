package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;


public class CatHouseTest
{
    @Test
    public void testAdd()
    {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();
        catHouse.add(new Cat("Bubba", new Date(), 23));
        catHouse.add(new Cat("Skeir", new Date(), 52));

        Integer i = 2;
        Assert.assertEquals(i, catHouse.getNumberOfCats());
    }


    @Test
    public void testRemoveId()
    {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();

        Cat d = new Cat("bleep", new Date(), 2);
        catHouse.add(d);
        Integer sizePrev = catHouse.getNumberOfCats();
        catHouse.remove(2);
        Integer postSize = catHouse.getNumberOfCats();

        boolean sizeNotEqual = sizePrev != postSize;

        Assert.assertEquals(true, sizeNotEqual);
    }
    @Test
    public void testRemoveCat()
    {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();

        Cat d = new Cat("asdklkj", new Date(), 24);
        catHouse.add(d);

        Integer size = catHouse.getNumberOfCats();
        Assert.assertEquals(new Integer(1), size);
        catHouse.remove(d);
        Integer newSize = catHouse.getNumberOfCats();
        Assert.assertEquals(new Integer(0), newSize);
        boolean sizeNotEqual = size != newSize;

        Assert.assertEquals(true, sizeNotEqual);
    }
    @Test
    public void getCatTest()
    {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();

        Cat d = new Cat("askdlkj", new Date(), 234);
        catHouse.add(d);

        String catName = catHouse.getCatById(234).getName();

        Assert.assertEquals("askdlkj", catName);
    }

    @Test
    public void getNumberCats()
    {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();

        Cat d = new Cat("asdlkjfd", new Date(), 23465);
        catHouse.add(d);

        Assert.assertEquals(new Integer(1), catHouse.getNumberOfCats());
    }

}
