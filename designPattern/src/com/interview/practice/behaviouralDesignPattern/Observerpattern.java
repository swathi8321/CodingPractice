package com.interview.practice.behaviouralDesignPattern;


//Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified,
//its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.

//create subject class
import java.util.ArrayList;
import java.util.List;

 class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}

//create observer class
 abstract class Observer {
	   protected Subject subject;
	   public abstract void update();
	}


//step3 Create concrete observer classes

 class BinaryObserver extends Observer{

	   public BinaryObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	   }
	}
 
// step 4:Use Subject and concrete observer objects.
 
 public class Observerpattern {
	   public static void main(String[] args) {
	      Subject subject = new Subject();

	     
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	   }
	}
