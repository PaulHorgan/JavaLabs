package com.qa;

public class FizzBuzz {
public String check(int One){

    if( One%3==0 && One%5 ==0){
        return "FizzBuzz";
    }else if (One%3 ==0) {
        return "Fizz";
    }else if(One%5 == 0){
        return "Buzz";
    }else{

        return Integer.toString(One);
    }

}

}
