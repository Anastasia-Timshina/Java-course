import java.io.*;

public class task1 {
    public static void main(String[] args)  {
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\nasta\\IdeaProjects\\texts\\tms.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку");
            String str = br.readLine();

            //нужно чтобы строчка в текст. док влетела

            FileInputStream fin = new FileInputStream( "C:\\Users\\nasta\\IdeaProjects\\texts\\tms.txt" );
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print(( char) i);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage()) ;
        }
        /*try (FileInputStream fin = new FileInputStream( "C:\\Users\\nasta\\IdeaProjects\\texts\\tms.txt" )){
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print(( char) i);
            }
        } catch (IOException ex) {
            System. out.println(ex.getMessage()) ;
        }*/
    }
}
