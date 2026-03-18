import java.io.*;

class ExcPro
{
    void m()
    {
        throw new IOException("IOException Throws");

    }
    void n()
    {
        m();
    }
    void p()
    {
        n();
    }

}
class ashu
{
    public static void main(String args[])
    {
        ExcPro obj = new ExcPro();
        obj.p();
        System.out.println("normal flow...");
    }
}