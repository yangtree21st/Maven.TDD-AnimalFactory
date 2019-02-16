package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {


    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testDogCreat(){
         String givenName = "BB";
         Date givenBd= new Date(0);

         Dog dog1 = AnimalFactory.createDog(givenName,givenBd);
         String actName = dog1.getName();
         Date actBd = dog1.getBirthDate();

        Assert.assertEquals(givenName,actName);
        Assert.assertEquals(givenBd,actBd);

    }



    @Test
    public  void testCatCreat(){

        String givenName = "cc";
        Date givenBd = new Date();

        Cat cat1 = AnimalFactory.createCat(givenName,givenBd);
        String acName = cat1.getName();
        Date acBd = cat1.getBirthDate();

        Assert.assertEquals(givenName,acName);
        Assert.assertEquals(givenBd,acBd);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
