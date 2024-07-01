public class ArrayPractice01 {
    public static void main(String[]arg){
      int []marks ={45,56,65,54,45};
        System.out.println(marks[4]);
        System.out.println(marks[0]);
        int lengtharray = marks.length;
        System.out.println("the length of the array is "+lengtharray);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        String [] studentNames={"Aditya","Aniket","Aryan","Akshay","Amol","Ajay"};
        System.out.println(studentNames.length);
        System.out.println(studentNames[4]);

    }
}
