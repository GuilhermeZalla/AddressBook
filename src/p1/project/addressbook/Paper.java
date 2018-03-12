package p1.project.addressbook;
 import java.util.Scanner;
  public class Paper{
   public static void main(String[] args){
      
       Scanner input = new Scanner(System.in);
       String name;
       int resp, numberCont;

       System.out.print("Enter the addressbook's name: ");
       name = input.next();
       System.out.print("Enter the number of contact: ");
       numberCont = input.nextInt();
       System.out.println(" ");
     
       AddressBook add1 = new AddressBook(name);
       Contact[] contact = new Contact[numberCont];  

     do{
       System.out.println(" ---------------------------------- \n"
                         +"|       DIGITAL ADDRESSBOOK        |\n"
                         +"|----------------------------------|\n"
                         +"|Would you like to write it down?  |\n"
                         +"|1-)Yes                            |\n"
                         +"|2-)No and leave                   |\n"
                         +" ---------------------------------- \n");
                         resp = input.nextInt();
     switch(resp){
         case 1:
         for(int i = 0; i < numberCont; ++i){
             System.out.println("Enter the information");
             Contact cont = new Contact();
            
             System.out.print("Enter the contact's name: ");
             String name1 = input.next();
             cont.setName(name1);
            
             System.out.print("Enter the telephone: ");
             String telephone = input.next();
             cont.setTelephone(telephone);
            
             System.out.print("Enter the email: ");
             String email = input.next();
             cont.setEmail(email);
             System.out.println(" ");
            
             contact[i] = cont;
            
             System.out.println(cont.contactInfo());
         }
       }
     }while(resp == 1);
             System.out.println("Turning off the Address book....");
  }       
}
