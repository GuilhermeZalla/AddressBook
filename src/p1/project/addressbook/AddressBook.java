package p1.project.addressbook;
 public class AddressBook{
     
     private String name;
     private Contact telephone;
     private Contact email;

 public AddressBook(String name){
     this.name = name;
 }
 public AddressBook(){}
 
 public String getName(){
     return name;
 }

 public void setName(String name){
     this.name = name;
 }

 public Contact getTelephone(){
     return telephone;
 }

 public void setTelephone(Contact telephone){
     this.telephone = telephone;
 }

 public Contact getEmail(){
     return email;
 }

 public void setEmail(Contact email){
     this.email = email;
 }   
}