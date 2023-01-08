package employee;
 
public class emp {
   private String name;
   private String empid;
   private String category;
   private double bpay;
   private double hra;
   private double da;
   private double npay;
   private double pf;
   private double grosspay;
   private double incometax;
   private double allowance;
 
   public emp(String n,String eid, String c, double bp)
   {
       this.name = n;
       this.empid = eid;
       this.category = c;
       this.bpay = bp;
   }
 
   public void setHra(double h)
   {
       this.hra=h;
   }
 
   public void setDa(double d)
   {
       this.da=d;
   }
 
   public void setPf(double pf)
   {
       this.pf=pf;
   }
 
   public void setIT(double incometax )
   {
       this.incometax=incometax;
   }
 
   public void setAllowance(double allowance )
   {
       this.allowance=allowance;
   }
 
   public void setNpay()
   {
       this.npay = bpay + hra + da + allowance - pf - incometax ;
   }
 
   public void setGpay()
   {
       this.grosspay = bpay + hra + da + allowance;
   }
 
   public String getName()
   {
      return name;
   }
 
   public String getEid()
   {
       return empid;
   }
 
   public String getCategory()
   {
       return category;
   }
 
   public double getBpay()
   {
       return bpay;
   }
 
   public double getHra()
   {
       return hra;
   }
 
   public double getDa()
   {
       return da;
   }
 
   public double getNpay()
   {
       return npay;
   }
 
   public double getPf()
   {
       return pf;
   }
 
   public double getGp()
   {
       return grosspay;
   }
 
   public double getIT()
   {
       return incometax;
   }
 
   public double getAllowance()
   {
       return allowance;
   }
 
}
