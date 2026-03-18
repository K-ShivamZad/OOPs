public class trycatch 
{
    public static void main(String args[])
    {
        int[]no = {1, 2, 3};

        try{
            System.out.println(no[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of the range");

        }
        System.out.println("QUIT");
        
        

    }
    
}
