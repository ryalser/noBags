package practice_5.task_6;

public abstract class Plant {

    private String name;

    public Plant (String name){
        this.name = name;
    }

    abstract void toLookAfter();
}
