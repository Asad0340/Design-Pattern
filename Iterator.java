/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.lab.task;

/**
 *
 */
public interface Iterator<E> {
   public boolean hasNext();
   public E next();
}

interface Container<E> {
   public Iterator<E> getIterator();
}

 class Student {
   private String name;
   private int registrationNumber;
   private String gender;
   private String phoneNumber;

   public Student(String name, int registrationNumber, String gender, String phoneNumber) {
      this.name = name;
      this.registrationNumber = registrationNumber;
      this.gender = gender;
      this.phoneNumber = phoneNumber;
   }

   public String getName() {
      return name;
   }

   public int getRegistrationNumber() {
      return registrationNumber;
   }

   public String getGender() {
      return gender;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", registrationNumber=" + registrationNumber +
              ", gender='" + gender + '\'' +
              ", phoneNumber='" + phoneNumber + '\'' +
              '}';
   }
}

class StudentRepository implements Container<Student> {
   private Student[] students = {
      new Student("Muhammad", 12345, "Male", "+92 1234567890"),
      new Student("Aisha", 54321, "Female", "+92 9876543210")
   };

   @Override
   public Iterator<Student> getIterator() {
      return new StudentIterator();
   }

   private class StudentIterator implements Iterator<Student> {

      int index;

      @Override
      public boolean hasNext() {
         if (index < students.length) {
            return true;
         }
         return false;
      }

      @Override
      public Student next() {
         if (this.hasNext()) {
            return students[index++];
         }
         return null;
      }
   }
}

 class IteratorPatternDemo {

   public static void main(String[] args) {
      StudentRepository studentRepository = new StudentRepository();

      String anyStartingValue = "M";

      for (Iterator<Student> iter = studentRepository.getIterator(); iter.hasNext();) {
         Student student = iter.next();

         if (student.getName().startsWith(anyStartingValue)) {
            System.out.println(student);
         }
      }
   }
}