public class Calc {

    public int sum (String expression){
        if(expression == null)
            return -1;
        String delimeter = "";
        if(expression.contains("//") && expression.contains("\n")) {
            delimeter = expression.substring(expression.indexOf("//") + 2, expression.indexOf("\n"));
            expression = expression.substring(expression.indexOf("\n")+1);
        }
        if(delimeter.isEmpty())
            return -1;
        if (expression.isEmpty())
            return 0;

        String[] numbers = expression.split(delimeter);

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
