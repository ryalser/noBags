package programming_principles.task_1;




public class MathOperations {

    // На входе передаем любое количество int
    public int add(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num; //каждый int записываем в sum
        }
        return sum;
    }

}
