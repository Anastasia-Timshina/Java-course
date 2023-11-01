import java.io.*;
public class task2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter( "C:\\Users\\nasta\\IdeaProjects\\texts\\tms2.txt" )) {
            fw.write( "Cognosce te ipsum" );
            fw.flush() ;
        } catch (Exception e) {
            e.printStackTrace() ;
        }

        try (FileReader fr = new FileReader( "C:\\Users\\nasta\\IdeaProjects\\texts\\tms2.txt" )) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print(( char) i);
            }
        } catch (Exception e) {
            e.printStackTrace() ;
        }
    }
}
