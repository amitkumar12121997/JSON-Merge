import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyPairClass<index> {

    static List<Json> list = new ArrayList<>();

    public static void getInput(Scanner input){
        int fileCount;

        System.out.println("Enter the number of files : ");
        fileCount = input.nextInt();

      for(int index=0; index<fileCount; index++) {

          int inputCount;
          System.out.println("Enter how many input from this files");
          inputCount = input.nextInt();

          for(int index1=0; index1<inputCount; index1++) {
              System.out.println("Enter Key : ");
              String key = input.next();
              System.out.println("Enter value : ");
              String value = input.next();

              list.add(new Json(key, value));
          }
      }
    }

    public static void printOutput() {
        for(Json student : list) {
            System.out.println("{ Name "+student.getKey()+" , Clubname "+student.getValue() + " } ");

        }
    }
}
