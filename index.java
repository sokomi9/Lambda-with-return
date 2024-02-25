@FunctionalInterface
interface Calculate
{
    int add(int i, int j);
}
public class index {
public static void main(String[] args) {
    
    Calculate addCalculate = (i, j) ->  i + j;
     
    int result = addCalculate.add(4, 5);
    System.out.println(result);
}
}