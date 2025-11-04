package practice_5.task_5;

public abstract class FarmAnimal {

    private String name;

    public FarmAnimal(String name){
        this.name = name;
    }

    abstract void getResource();
    abstract void toLookAfter();
}
