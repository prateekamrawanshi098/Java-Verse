// //Admission to professional course is given acording to following criteria :

// 1.Marks in phy>=50 And Marks in chem>=55 and marks in Maths>=60

// 2.Total in all three sub >=220 or total in maths and phy >=130

// In all other cases admission is not given. 

// Wap to accept marks in P,C,M from user and find out wheather the user is eligible for admission or not.



// Do
// not use
// Logical operator


    class Example2 {
    public static void main(String[] args) {

        int P = Integer.parseInt(args[0]);
        int C = Integer.parseInt(args[1]);
        int M = Integer.parseInt(args[2]);

        if (P >= 50) {

            if (C >= 55) {

                if (M >= 60) {

                    if ((P + C + M) >= 220) {
                        System.out.println("Admission successful");
                    }

                    else {

                        if ((P + M) >= 130) {
                            System.out.println("Admission successful");
                        }

                        else {
                            System.out.println("Admission failed");
                        }
                    }
                }

                else {
                    System.out.println("Admission failed");
                }
            }

            else {
                System.out.println("Admission failed");
            }
        }

        else {
            System.out.println("Admission failed");
        }
    }
}