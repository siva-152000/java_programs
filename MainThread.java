class A extends Thread
{
     public void run()
      {
        for(int i=0;i<3;i++)
        System.out.println("thread1 is executing");
       }  
 }      

  class B extends Thread
  {
      public void run()
      {
        for(int j=0;j<3;j++)
        System.out.println("thread2 is executing");
       } 
    }

   class C extends Thread
   {
     public void run()
     {
        for(int k=0;k<3;k++)
        System.out.println("thread2 is executing");
     }
   }   
   
   class MainThread
    { 
      public static void main(String args[]) 
       {
       A t1=new A();
       System.out.println("t1 priority="+t1.getPriority());
       t1.setPriority(Thread.MAX_PRIORITY);
       System.out.println("after setting t1 priority"+t1.getPriority());       
       System.out.println("Name is"+t1.getName());
       t1.setName("I have named it as MyThread1");
       System.out.println("t1 after setname "+t1.getName());

       B t2=new B();
       System.out.println("t2 priority="+t2.getPriority());
       t2.setPriority(Thread.MIN_PRIORITY);
       System.out.println("after setting t2 priority"+t2.getPriority());       
       System.out.println("Name is"+t2.getName());
       t2.setName("I have named it as MyThread2");
       System.out.println("t2 after setname "+t2.getName());

       C t3=new C();
       System.out.println("t3 priority="+t3.getPriority());
       t3.setPriority(Thread.NORM_PRIORITY);
       System.out.println("after setting t3 priority"+t3.getPriority());       
       System.out.println("Name is"+t3.getName());
       t3.setName("I have named it as MyThread3");
       System.out.println("t3 after setname "+t3.getName());

       System.out.println("thread1 is executing");
       t1.start();
       System.out.println("thread2 is executing");
       t2.start();
       System.out.println("thread3 is executing");
      t3.start();
    }
}
