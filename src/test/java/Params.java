import org.assertj.core.internal.bytebuddy.asm.Advice;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Params {
    public String expectedTitle = "iPaper System";
    public String iPaperSystem = "iPaper System";
    public String theme_color_value = "rgba(201, 36, 42, 1)";
    public String Username_is_required = "Username is required.";
    public String Password_is_required = "Password is required.";
    public String You_provide_wrong_password = "You provide wrong password.";
    public String Username_does_not_exist = "Username does not exist.";
    public String tooltip_Static = "Statistic";
    public String tooltip_document = "Incoming documents";
    public String tooltip_SearchDocument = "Search documents";
    public String tooltip_CreateDuconemt = "Requirement template";
    public String tooltip_userguide = "User guide";
    public String tooltip_Support = "Support";
    public String size = "(40, 40)";
    public String wellcome = "Welcome";
    public String notification = "Notification";

    public void printToTxt(String message) {

        String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
        File file = new File("LogRunDate" + idForTxtFile);
        try {
            FileWriter fw = new FileWriter(file, true);

            //if you want to write the linesperator ("\n) as they are in the txt you should use the following Code:

            String lineSeparator = System.getProperty("line.separator");
            String[] output = message.split("\n");

            for (int i = 0; i <= output.length - 1; i++) {
                fw.write(output[i]);
                fw.write(lineSeparator);
            }

            //instead you could only use:
            fw.write(message);

            fw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String Readpass() {
        BufferedReader br = null;
        String temp = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("Password.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                temp = sCurrentLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return temp;
    }

    public String ReadUserName() {
        String text = "";
        int lineNumber;
        try {
            FileReader readfile = new FileReader("UserName.txt");
            BufferedReader readbuffer = new BufferedReader(readfile);
            for (lineNumber = 1; lineNumber < 7; lineNumber++) {
                if (lineNumber == 1) {
                    text = readbuffer.readLine();
                } else
                    readbuffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public String ReadUserNameFile() {
        BufferedReader br = null;
        String temp = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("UserName.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                temp = sCurrentLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return temp;
    }
}
