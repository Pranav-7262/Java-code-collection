package OOP.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int []data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;

    public CustomArrayList(){
          this.data = new int[DEFAULT_SIZE];
      }
      public void add(int num){
          if (isEmpty()){
              resize();
          }
          data[size++]=num;
      }
      private void resize(){
          int []temp = new int[data.length*2];
          for (int i = 0; i < data.length; i++) {
              data[i]=temp[i];
          }
          data=temp;
      }
      public boolean isEmpty(){
        return size== data.length;
      }
      public int removed(){
        int removed = data[--size];
        return removed;
      }
      public int get(int index){
        return data[index];
      }
     public int size(){
        return size;
    }
    public void get(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ",size :" + size + '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
//        list.add(23);
//        list.add(56);
//        list.add(34);
        for (int i = 0; i <14; i++) {
            list.add(2);
        }
        System.out.println(list);
//        ArrayList<Integer> l2 = new ArrayList<>()
        //<Integer> --> this is a Generics(Parameterised type)
    }

}
