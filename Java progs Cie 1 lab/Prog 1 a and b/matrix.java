class matrix
{
       int r;
       int c;
 
       void setRows(int a)
       {
           this.r=a;
       }
 
       void setCol(int b)
       {
           this.c=b;
       }
 
      
       void setEle(int i,int j,int ele )
       {   int a[][]= new int[r][c];
           a[i][j]=ele;
       }
 
       void addMat(int r1,int c1,int r2, int c2,int m1[][], int m2[][])
       {
           //try{
           if(r1!=r2 || c1!=c2)
           {
               System.out.println("Matrices cannot be added");
           }
           //}
           //catch(IndexO
           else
           {   int c[][] = new int[r1][c1];
               for(int i=0;i<r1;i++)
               {
                   for(int j=0;j<c1;j++)
                   {
                       c[i][j]= m1[i][j]+ m2[i][j];
                   }
               }
 
               //print c
               System.out.println("Sum of 2 arrays is -");
               for(int i=0;i<r1;i++)
               {
                   for(int j=0;j<c1;j++)
                   {
                       System.out.print(c[i][j]+" ");
                   }
                   System.out.println();
               }
 
           }
       }
 
       public static void main(String args[])
       {
           matrix o1= new matrix();
           o1.setRows(2);
           o1.setCol(2);
           o1.setEle(0,1,10);
           int a[][]={{10,20},{30,40}};
           int b[][]={{5,10},{15,20}};
           o1.addMat(2,2,2,2,a,b);
        }
 
   }