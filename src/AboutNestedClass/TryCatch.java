package Compare;

public class TryCatch {
    public static void main(String[] args) {
        int num = 15;
        try{
            int result = num/0;
            System.out.println(result);
        }
        catch (Exception ex){
            System.out.println("not correct");
        }// this try catch block using for take runtime error , can handling runtime exception,
        //if there is a exception being catched , it will go to the next step , if there is error we don't use
        //try catch , then it will let us exit from class,we cannot able to see what kind of error the class have
        System.out.println("check for follow statement can be run or not");

    }
}
