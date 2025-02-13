package org.example.efficientFileCopy;
import java.io.*;
public class Copy {
    public static void main(String[] args) {
        String sourcefile="D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\efficientFileCopy\\source.txt";
        String destin="D:\\week-04\\Day3_Stream\\src\\main\\java\\org\\example\\efficientFileCopy\\destin.txt";
        long starttime,endtime;
        try(BufferedInputStream b=new BufferedInputStream(new FileInputStream(sourcefile));
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(destin))){
            byte[] buffer=new byte[4096];
            int bytesRead;
            starttime=System.nanoTime();
            while((bytesRead=b.read(buffer))!=-1){
                bo.write(buffer, 0,bytesRead);
            }
            endtime=System.nanoTime();
            System.out.println("buffer stream copy"+(endtime-starttime)/1_000_000+"ms");
        }catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
        try(FileInputStream f=new FileInputStream(sourcefile);
            FileOutputStream fo=new FileOutputStream(destin)){
            int byteData;
            starttime=System.nanoTime();

            while((byteData=f.read())!=-1){
                fo.write(byteData);
            }
            endtime=System.nanoTime();
            System.out.println("unbuffered copy"+(endtime-starttime)/1_000_000+"ms");}
        catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}
