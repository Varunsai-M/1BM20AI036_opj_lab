class matrix{
    int r;
    int c;
    int ele[][];
    matrix(int r,int c)
    {
        this.r = r;
        this.c = c;
        this.ele = new int[r][c];
    }
    int getrows()
    {
        return r;
    }
    int getcolumns()
    {
        return c;
    }
    void setvalues(int i,int j,int element)
    {
        this.ele[i][j] = element;
    }
    void addmatrix(matrix m1,matrix m2)
    {
        if(this.r!=m2.r || this.c!=m2.c){
            System.out.println("cant add matrices");
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                this.ele[i][j] = this.ele[i][j]+ m2.ele[i][j];
            }
        }
    }
    void display()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(this.ele[i][j] + " ");
            }
             System.out.println();
        }
    }
}




public class matrix_1a {
    public static void main(String args[])
    {
        matrix m1 = new matrix(2,2);
        matrix m2 = new matrix(2,2);
        m1.setvalues(0,0,10);
        m1.setvalues(0,1,20);
        m1.setvalues(1,0,30);
        m1.setvalues(1,1,40);


        m2.setvalues(0, 0, 10);
        m2.setvalues(0,1,20);
        m2.setvalues(1,0,30);
        m2.setvalues(1,1,40);


        m1.addmatrix(m1, m2);
        m1.display();
    }
}