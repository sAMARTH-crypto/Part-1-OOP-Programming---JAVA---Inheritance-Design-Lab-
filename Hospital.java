public class Hospital extends HospitalEmployee
{
   //-----------------------------------------------------------------
   //  Creates several objects from classes derived from
   //  HospitalEmployee.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      HospitalEmployee vito = new HospitalEmployee ("Vito",112);
      
      Doctor michael = new Doctor ("Micheal","Heart",234,true);
      
      Surgeon vincent = new Surgeon ("Vincent","Brain",456,true);
      
      Nurse sonny = new Nurse ("Sonny", 789, 6);
      

      // print the employees
      System.out.println (vito);
      System.out.println (michael);
      System.out.println (vincent);
      System.out.println (sonny);
      

      // invoke the specific methods of the objects
      vito.work();
      michael.work();
      vincent.work();
      sonny.work();
     
   }
}
