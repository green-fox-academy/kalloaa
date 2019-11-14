package kalloaa.resta.restproject.services;

import kalloaa.resta.restproject.models.MyArray;
import kalloaa.resta.restproject.models.MyResult;
import kalloaa.resta.restproject.models.MyUntil;
import org.springframework.stereotype.Service;

@Service
public class RestService {

  public MyResult factorialOf(MyUntil number){
    int temp = 1;
    for (int i = 1; i <=number.getUntil() ; i++) {
      temp=temp*i;
    }
    return new MyResult(temp);
  }

  public MyResult additiveOf(MyUntil number){
    int temp = 0;
    for (int i = 0; i <= number.getUntil() ; i++) {
      temp+=i;
    }
    return new MyResult(temp);
  }

  public Object arrayHandler(MyArray myArray){
    if(myArray.getWhat().equals("sum")){
      return sumArray(myArray.getNumbers());
    }else if (myArray.getWhat().equals("multiply")){
      return multiplyArray(myArray.getNumbers());
    }else{
      return doubleArray(myArray.getNumbers());
    }
  }

  public int sumArray(int[] numbers){
    int temp = 0;
    for (int i = 0; i <numbers.length ; i++) {
      temp+=numbers[i];
    }
    return temp;
  }

  public int multiplyArray(int[] numbers){
    int temp = 1;
    for (int i = 0; i <numbers.length ; i++) {
      temp=temp*numbers[i];
    }
    return temp;
  }

  public int[] doubleArray(int[] numbers){
    for (int i = 0; i <numbers.length ; i++) {
      numbers[i]+=numbers[i];
    }
    return numbers;
  }
}
