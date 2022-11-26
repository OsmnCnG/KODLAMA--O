public class Arrays_kodlama_io {
    public static void main(String[] args) {


        String student1= "O";
        String student2= "S";
        String student3= "M";
        String student4= "A";
        String student5= "N";

        String[] students= new String[5];

        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        students[3]=student4;
        students[4]=student5;

        System.out.print("[");
        for(int i=0;i< students.length;i++){
            System.out.print(students[i]);
            if(students.length!=i+1){
                System.out.print(",");
            }
        }
        System.out.println("]");



    }
}