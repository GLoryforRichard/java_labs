import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyborad = new Scanner(System.in);
        // create a system which collect information about the student in this
        // course process them and create a formatted table
        // I like to collect the mark the students also for the course content
        int [] stdIDs;
        String [] stdNames;
        String [] courseContent = new String[] {"Midterm","Final","Lab test","Quizes","Assignments"};
        float[][] marks;
//        byte weight new byte[]{25,};
        float[] finalMarks;

        System.out.println("How many students you like to keep record of:");
        byte number_student = Byte.parseByte(keyborad.nextLine());

        stdIDs = new int[number_student];
        stdNames = new String[number_student];
        marks = new float[number_student][courseContent.length];
        finalMarks = new float[number_student];

        for(int i = 0; i<number_student;i++){
            System.out.printf("Enter the id of student #%d ",i+1);
            stdIDs[i] = Integer.parseInt(keyborad.nextLine());

            System.out.printf("Enter the name of student #%d ",i+1);
            stdNames[i] = keyborad.nextLine();
            float finalMark = 0.0f;

            for (int j = 0; j < courseContent.length;j++){
                System.out.printf("Enter the %s mark for student # %d",courseContent[j],i+1);
                marks[i][j] = Float.parseFloat(keyborad.nextLine());
//                finalMark += marks[i][j]*weight;
            }
        }

        // ----------------------------------------------------
        for(int i = 0;i < stdNames.length;i++){
            System.out.printf("Student ID : %d ----- Student Name: %s\n",stdIDs[i],stdNames[i]);
            System.out.println("====================================================");
//            System.out.println(Arrays.toString(courseContent));
//            System.out.println(Arrays.toString(marks[i]));
            for (int j = 0;j<courseContent.length;j++){
                System.out.printf("%s : %.2f\n",courseContent[j],marks[i][j]);
            }
        }


    }
}
