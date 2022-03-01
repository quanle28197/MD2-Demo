import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class JavaAndroidVn {

    public static void main(String args[]) throws IOException {

        DataOutputStream dataOut;
        DataInputStream dataIn;
        int i = 2013;
        double d = 3.14;
        boolean b = true;
        char ch = 'A';
        String str = "Android.Vn";

        try {
            dataOut = new DataOutputStream(new FileOutputStream("E:\\androidvn.dat"));
        } catch (IOException exc) {
            System.out.println("Cannot open file.");
            return;
        }

        try {
            System.out.println("Writing Int: " + i);
            dataOut.writeInt(i);
            System.out.println("Writing Double: " + d);
            dataOut.writeDouble(d);
            System.out.println("Writing boolean: " + b);
            dataOut.writeBoolean(b);
            System.out.println("Writing Double: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
            System.out.println("Writing char: " + ch);
            dataOut.writeChar(ch);
            System.out.println("Writing String: " + str);
            dataOut.writeUTF(str);
        } catch (IOException exc) {
            System.out.println("Write error.");
        }

        dataOut.close();
        System.out.println();