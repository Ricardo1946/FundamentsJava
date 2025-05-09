package JavaFilePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class CreateUsingFile {
    public void newFile() {
        String strPath, strName;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");

            strName = br.readLine();
            System.out.println("Enter the file path: ");

            strPath = br.readLine();

            File file1 = new File(strPath + "\\" + strName + ".txt");

            file1.createNewFile();
        }
        catch (Exception ex1) {
            System.out.println("Failed to create a file.");
        }
    }

    public static void main(String[] args) {
        CreateUsingFile gfg = new CreateUsingFile();
        gfg.newFile();
    }
}
