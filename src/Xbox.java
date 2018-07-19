public class Xbox {
    public void  checking(int number1, int number2, int number3, int number4){

        if (number1 < number2 && number1 < number3 && number1 < number4){
            System.out.println("Наименьшее число из четырех number1 = " + number1);
            } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            System.out.println("Наименьшее число из четырех number2 = " + number2);
        } else if (number3 < number1 && number3 < number2 && number3 < number4) {
            System.out.println("Наименьшее число из четырех number3 = " + number3);
        }else {
            System.out.println("Наименьшее число из четырех number4 = " + number4);
        }
        if (number1 > number2 && number1 > number3 && number1 > number4){
            System.out.println("Наибольшее число из четырех number1 = " + number1);
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println("Наибольшее число из четырех number2 = " + number2);
        } else if (number3 > number1 && number3 > number2 && number3 > number4) {
            System.out.println("Наибольшее число из четырех number3 = " + number3);
        } else if (number1 == number2 && number1 > number3 && number1 > number4&& number2 > number3 && number2 > number4)  {
            System.out.println(number1+number2 + " = Наибольшие числа number1 и number2, сумируем их");
        } else if (number1 == number3 && number1 > number2 && number1 > number4&& number3 > number2 && number3 > number4)  {
            System.out.println(number1+number3+" = Наибольшие числа number1 и number3, сумируем их");
        } else if (number1 == number4 && number1 > number2 && number1 > number3&& number4 > number2 && number4 > number3)  {
            System.out.println(number1+number4+" = Наибольшие числа number1 и number4, сумируем их");
        } else if (number2 == number3 && number2 > number1 && number2 > number4&& number3 > number1 && number3 > number4)  {
            System.out.println(number2+number3 + " = Наибольшие числа number2 и number3, сумируем их");
        } else if (number3 == number4 && number3 > number1 && number3 > number2&& number4 > number1 && number4 > number2)  {
            System.out.println(number3+number4 +" = Наибольшие числа number3 и number4, сумируем их");

        }else {
            System.out.println("Наибольшее число из четырех number4 = " + number4);

        }
    }
}
