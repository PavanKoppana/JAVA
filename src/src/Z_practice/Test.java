import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Test{
    public void getByte(){
        Byte[] Arr = new Byte[5];
        Arr[0] = 0;
        Arr[1] = 10;
        Arr[2] = 20;
        Arr[3] = 30;
        Arr[4] = 50;
        System.out.println(Arrays.toString(Arr));
        Arrays.toString(Arr);
        System.out.println(Arr);


    }
    public static void main(String[] x) throws IOException {

        Test obj = new Test();
        //obj.getByte();
        obj.getfilename();
    }
    public static void getfilename() throws IOException {

        String folderName = "..PavanRaja";
        File filepath = new File(folderName);
        System.out.println(filepath);
        String S = String.valueOf(filepath.toPath());
        System.out.println(S);
        Path y = Paths.get(folderName);
        System.out.println(y);
    }
}