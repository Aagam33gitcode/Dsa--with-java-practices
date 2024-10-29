public class pattern{
public static void main(String[] args) {
//Question 1

    /*    *
      **
      ***
      ****
      ******
 */
for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
   System.out.println();
}


//Question 2
/*
 *****
 ****
 ***
 **
 *
 */
for(int i=1;i<=6;i++){
    for(int j=1;j<=(6-i);j++){
        System.out.print("*");
    }System.out.println();
}


//question 3
/*
 1
 12
 123
 1234
 12345
 */

for(int i=1;i<=5;i++){
    for (int j = 1; j <=i ; j++){
        System.out.print(j);
    }
    System.out.println();
   
}

//Question 4
/*
 A
 BC
 DEF
 GHIJ
 KLMNO
 */
 char charw='A';
for (int i=1;i<=5;i++) {
    for(int j=1;j<=i;j++){
        System.out.print(charw);
        charw++;
    }
    System.out.println();
    
}

//question 5
/*
 ******
 ******
 ******
 ******
 */

 for (int i = 1; i <= 4; i++){
    for(int j=1;j<=6;j++){
        System.out.print("*");

    }System.out.println();
     
 }


 //Question  6:
 /*
  ********
  *      *
  *      *
  *      *
  *      *
  ******** 
  */


  for(int i=1;i<=6;i++){
  
    for(int j=1;j<=8;j++){
        if(i==1||i==6||j==1||j==8){
            System.out.print("*");
        }else{
            System.out.print(" ");

        }
    }System.out.println();
  }


//question 7

/*
      *
     ***
    *****
   *******
  *********   
 */


 for(int i=1;i<=5;i++){
    for(int j=1;j<=(5-i);j++){
        System.out.print(" ");
        
    }
    for(int k=1;k<=(2*i-1);k++){
        System.out.print("*");

    }System.out.println();
 }


 //question 8
/*
 1234567
 2345671
 3456712
 4567123
 5671234
 6712345
 7123456
 */

 for (int i=1;i<=7;i++){
    for(int j=i;j<=7;j++){
        System.out.print(j);
    }
    for(int k=1;k<=(i-1);k++){
        System.out.print(k);
    }
   System.out.println();
 }


 //question 9

 /*
 121212
 212121
 121212
 212121
 121212 
 
 */

 for(int i=1;i<=5;i++){
    for(int j=1;j<=6;j++){
        if((i+j)%2==0){
            System.out.print("1");

        }else{
            System.out.print("2");
        }
    }System.out.println();
 }


 







































}


}