import employee.emp;
class emppay{
   public static void main(String args[])
   {
       emp e = new emp("John Doe","A100","HR",20000);
       e.setHra(1000);
       e.setDa(200);
       e.setPf(400);
       e.setIT(250);
       e.setAllowance(800);
       e.setNpay();
       e.setGpay();
 
       System.out.println("Name = "+e.getName());
       System.out.println("Employee id = "+e.getEid());
       System.out.println("Category = "+e.getCategory());
       System.out.println("Basic pay = "+e.getBpay());
       System.out.println("HRA = "+e.getHra());
       System.out.println("DA = "+e.getDa());
       System.out.println("PF = "+e.getPf());
       System.out.println("Income Tax = "+e.getIT());
       System.out.println("Allowance = "+e.getAllowance());
       System.out.println("Net pay = "+e.getNpay());
       System.out.println("Name = "+e.getGp());
   }
}
