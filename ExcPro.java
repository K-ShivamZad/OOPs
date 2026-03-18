import java.io.IOException;

class ExcPro {
    void m() throws IOException {
        throw new IOException("IOException Throws");
    }

    void n() throws IOException {
        m();
    }

    void p() throws IOException {
        n();
    }
}

class ashu {
    public static void main(String args[]) {
        ExcPro obj = new ExcPro();
        try {
            obj.p();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("normal flow...");
    }
}
