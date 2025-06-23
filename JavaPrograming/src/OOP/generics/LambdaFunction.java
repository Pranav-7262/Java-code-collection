package OOP.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 1);
        }
//        list.forEach((item) ->
//                System.out.println(item*2));
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        list.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation mul = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;
        Operation div = (a,b) -> a/b;

        LambdaFunction function = new LambdaFunction();
        System.out.println(function.operate(2,4,sum));
        System.out.println(function.operate(2,4,mul));
        System.out.println(function.operate(2,4,sub));
        System.out.println(function.operate(2,4,div));



    }
        private int operate(int a,int b,Operation op){
            return op.Operation(a,b);

    }
}
interface Operation{
    int Operation(int a,int b);
}
