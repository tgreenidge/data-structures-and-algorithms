package java401codechallenges;

public class AnimalShelter {
    Queue<Cat> catQueue;
    Queue<Dog> dogQueue;

    public AnimalShelter() {
        this.catQueue = new Queue<>();
        this.dogQueue = new Queue<>();
    }

    public void enqueue(Animal animal) {
        if (animal.getClass().getName().endsWith("Cat")) {
            catQueue.enqueue((Cat) animal);
        } else if (animal.getClass().getName().endsWith("Dog")){
            dogQueue.enqueue((Dog) animal);
        } else {
            throw new IllegalArgumentException("Only Dogs and Cats allowed");
        }
    }

    public Animal dequeue(String pref) {

        if(pref.toLowerCase() != "dog" && pref.toLowerCase() != "cat")
            return null;
        else if (pref.toLowerCase().equals("cat")){
            return catQueue.dequeue();
        } else {
            return dogQueue.dequeue();
        }
    }
}
