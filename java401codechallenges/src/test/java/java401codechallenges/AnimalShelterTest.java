package java401codechallenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    AnimalShelter shelter = new AnimalShelter();

    @Before
    public void setUpShelter() {
        shelter = new AnimalShelter();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnqueueNotCatOrDog() {
        Animal justAnAnimal = new Animal();
        shelter.enqueue(justAnAnimal);
    }

    @Test
    public void testEnqueueCat() {
        Cat cat = new Cat("Felix", "gold");
        shelter.enqueue(cat);
        assertEquals("Shelter should have cat in cat queue", "Felix", shelter.catQueue.front.value.name);
    }

    @Test
    public void testEnqueueDog() {
        Dog dog = new Dog("Rover", "gold");
        shelter.enqueue(dog);
        assertEquals("Shelter should have dog in dog queue", "Rover", shelter.dogQueue.front.value.name);
    }

    @Test
    public void testDequeueCat() {
        Cat cat = new Cat("Felix", "gold");
        Dog dog = new Dog("Rover", "gold");
        shelter.enqueue(cat);
        shelter.enqueue(dog);
        shelter.dequeue("cat");
        assertNull("Cat queue should be empty",  shelter.catQueue.front);
    }

    @Test
    public void testDequeueDog() {
        AnimalShelter shelter = new AnimalShelter();

        Dog dog = new Dog("Rover", "gold");
        Cat cat = new Cat("Felix", "gold");
        shelter.enqueue(dog);
        shelter.enqueue(cat);
        shelter.dequeue("dog");
        assertNull("Dog queue should be empty",  shelter.dogQueue.front);
    }
}
