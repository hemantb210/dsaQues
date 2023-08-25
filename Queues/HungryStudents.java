package Queues;
//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch

public class HungryStudents {
    public static void main(String[] args) {
        int [] students = {1,1,0,0};
        int [] sandwiches={0,1,0,1};
        int c = countStudents(students,sandwiches);
        System.out.println(c);

    }

    private static int countStudents(int[] students, int[] sandwiches) {
        int numberOfStudentsPreferZero=0;
        int numberOfStudentsPreferOne=0;
        for(int i =0; i<students.length;i++){
         if(students[i]==0){
             numberOfStudentsPreferZero++;
         }
         else numberOfStudentsPreferOne++;
        }
        for(int i =0; i<sandwiches.length;i++){
            if(sandwiches[i]==0){
                if(numberOfStudentsPreferZero>0){
                    numberOfStudentsPreferZero--;
                }
                else{
                    return numberOfStudentsPreferOne;
                }
            }
            else{
                if(numberOfStudentsPreferOne>0){
                    numberOfStudentsPreferOne--;
                }
                else return numberOfStudentsPreferZero;

            }

        }
        return 0;
    }


}
