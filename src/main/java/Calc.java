public class Calc {

    public int sum (String expression){
        if(expression == null)
            return -1;
        if (expression.isEmpty())
            return 0;

        String[] numbers = expression.split(",");
        if(numbers.length > 3)
            return -1;

        return getSum(numbers);
    }

    public int add (String expression){
        if(expression == null)
            return -1;
        if (expression.isEmpty())
            return 0;

        String[] numbers = expression.split(",");
        return getSum(numbers);
    }

    private int getSum(String [] numbers){
        int sum = 0;
        for(String num : numbers) {
            try {
                sum = sum + Integer.parseInt(num);
            } catch (NumberFormatException numberFormatException) {
                return -1;
            }
        }
        return sum;
    }
}
