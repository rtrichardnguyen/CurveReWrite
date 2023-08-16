import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) {

        try {

            File oldCurve = new File("C:/Users/rtric/Desktop/ResumeProjects/CurveReWrite/StandardNormalDistribution.txt");
            Scanner read = new Scanner(oldCurve);
            FileWriter write = new FileWriter("orderedCurve.txt");

            while (read.hasNextLine()) {
                if (!read.hasNext()) {
                    read.nextLine();
                }
                write.write(read.next() + " ");
                write.write(read.next() + "\n");
            }
            write.close();
            read.close();
        }
        catch (IOException e) {
            System.out.println("not created");
            e.printStackTrace();
        }

    }
}
