public class Calc {

    public int sum (String expression){
        if (expression.isEmpty())
            return 0;
        String[] numbers = expression.split(",");
        if(numbers.length > 3)
            return -1;
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

    public int add (String expression){
        throw new UnsupportedOperationException();
    }
}
