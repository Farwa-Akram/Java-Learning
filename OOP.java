Princilples of OOP
##Inheritance:
 ================          
package inheritence;
class Animal {
    public Animal() {

        System.out.println("A new animal has been created!");
    }

     

    public void sleep() {

        System.out.println("An animal sleeps");

    }

     

    public void eat() {

        System.out.println("An animal eats");

    }

}
     class Dog extends Animal {
    public Dog() {

        super();

        System.out.println("A new dog has been created!");

    }

     
  @Override

    public void sleep() {

       System.out.println("A dog sleeps...");

    }

     

    @Override

    public void eat() {

        System.out.println("A dog eats...");

  }

    }
 class Bird extends Animal {

    public Bird() {

        super();

        System.out.println("A new bird has been created!");

    }

     

    @Override//methods are override

    public void sleep() {

        System.out.println("A bird sleeps");

    }
     

    @Override

    public void eat() {
        System.out.println("A bird eats");//

    }

}

public class InHeritence {

    
    public static void main(String[] args) {
       

      Animal animal = new Animal();

      Bird bird = new Bird();

        Dog dog = new Dog();

         

        System.out.println();

         

       animal.sleep();

        animal.eat();

         

        bird.sleep();

        bird.eat();

         
        dog.sleep();

        dog.eat();

    }//end main

}//End class


######Encapsulation:
=================
            
package user;


public class User {
private int User_id;
private String username = null;
private String password = null;
private String email = null;
    
public User(int User_id,String username, String password,String email) {
this.User_id =User_id;
this.username=username;
this.password = password;
 this.email = email;
}
public int getUser_id
{
         return User_id;
}
public void setUser_id(int User_id)
{
        this.User_id=User_id;
}
public String getUsername() {
          return username;
}
public void setUsername(String username)
 {
this.username = username;
}
 public String getPassword() {return password;
 }
 public void setPassword(String password)
{
 this.password=password;
 }
 public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public static void main(String[] args) 
{
User user1 = new User(001,"ABCDEf","1234567","abscdf@gmail.com");
System.out.println(user1.getUser_id());

System.out.println("My new username is: " + user1.getUsername() + "\n");
System.out.println("My Email-adress is : "+user1.getEmail());
System.out.println("My password is: " + user1.getPassword());
}

}

 ####Polymorphisam: 

package polymorphism;
class Animal {
 public Animal() {

        System.out.println("A new animal has been created!");
}

     
public void sleep() {

        System.out.println("An animal sleeps");

  }

     

 public void eat() {

        System.out.println("An animal eats");

}

}
     class Dog extends Animal {
    public Dog() {

        super();

        System.out.println("A new dog has been created!");

    }

     
  @Override

    public void sleep() {

       System.out.println("A dog sleeps...");

    }

     

    @Override

    public void eat() {

        System.out.println("A dog eats...");

  }

    }
 class Bird extends Animal {

    public Bird() {

        super();

        System.out.println("A new bird has been created!");

    }

     

    @Override//methods are override

    public void sleep() {

        System.out.println("A bird sleeps");

    }
     

    @Override

    public void eat() {
        System.out.println("A bird eats");//

    }

}

public class PolyMorphism {

    
    public static void main(String[] args) {
       

      Animal animal = new Animal();

      Bird bird = new Bird();
      Dog dog = new Dog();
     Animal bird1=new Bird();//parent class reference is used to refer to a child class object.
     Animal dog1=new Dog();//parent class reference is used to refer to a child class object.
         

        System.out.println();
animal.sleep();
animal.eat();
bird.sleep();
bird.eat();
dog.sleep();
dog.eat();
bird1.eat();//parent refrence object call
bird1.sleep();//parent refrence object call
dog1.eat();//parent reference object call
dog1.sleep();//parent reference object call
    }

}

  


 ####Abstrcat:
==============
abstract class Car{

abstract void run();

}

class Honda extends Car

{

void run()

{

System.out.println("running very fast");

}

public static void main(String args[]){

Car obj = new Honda();

obj.run();

}
}
Status API Training Shop Blog About Pricing
© 2015 GitHub, Inc. Terms Privacy Security Contact 