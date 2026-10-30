class mul
   {
    int mull(int x,int y)
      {
         System.out.println("2 int");
         return x*y;
      }

   }
   class LaunchMo
     {
        public static void main(String args[])
            {
            mul m =new mul();
            int a=m.mull(4,40);
            System.out.println(a);
            //System.out.println(m.mull(4,40));
            }
     }