package OOP.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T>{
        private Object[]data;
        private static int DEFAULT_SIZE = 10;
        private int size =0;

        public CustomGenArrayList(){
             data = new Object[DEFAULT_SIZE];
        }
        public void add(T num){
            if (isEmpty()){
                resize();
            }
            data[size++]=num;
        }
        private void resize(){
            Object[]temp = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        public boolean isEmpty(){
            return size== data.length;
        }
        public T removed(){
            T removed = (T)(data[--size]);
            return removed;
        }
        public T get(int index){
           return (T)(data[index]);
        }
        public int size(){
            return size;
        }
        public void get(int index,T value){
            data[index]=value;
        }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ",size :" + size + '}';
        }

        public static void main(String[] args) {
//            OOP.generics.CustomArrayList list = new OOP.generics.CustomArrayList();
//        list.add(23);
//        list.add(56);
//        list.add(34);
//            for (int i = 0; i <14; i++) {
//                list.add(2);
//            }
//            System.out.println(list);
//        ArrayList<Integer> l2 = new ArrayList<>()
            //<Integer> --> this is a Generics(Parameterised type)

//            ArrayList<Integer>list = new ArrayList<>();
//            for (int i = 0; i < 12; i++) {
//                list.add(2*i);
//            }
//            System.out.println(list);
            ArrayList<String>l3 = new ArrayList<>();
            l3.add("pranav");
            l3.add("hdf");
            System.out.println(l3);
            System.out.println(l3.size());
        }

    }


