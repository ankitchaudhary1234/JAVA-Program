public class IJArraydemo {

  public static void main(String[] args) {
    int arr[] = {10,20,30,40,50};
    int index = 1;
    int value = 45;
    for (int i = arr.length-1; i >index ; i--) {
      arr[i] = arr[i-1];
    }
    arr[index]= value;
    for (int i = 0; i <arr.length ; i++) {
      System.out.println(arr[i]);
    }
  }

}

