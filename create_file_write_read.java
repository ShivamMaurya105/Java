//Wap to create a file...
/*import java.io.File;
import java.io.IOException;
class create_file
{
    public static void main(String args[])
    {
    try
     {
        File tfile=new File("D:Rivesh.txt");
        if(tfile.createNewFile())
        {
            System.out.println("file created successfully"+tfile.getName());
        }
        else
        {
            System.out.println("file already exist in the directory"); 
        }
       
     
    }
    catch(IOException Exception)
    {
        System.out.println("error occured");
        Exception.printStackTrace();
    }
}
*/

//wap to write content in a file...
/*
import java.io.FileWriter;
import java.io.IOException;
class create_file
{
    public static void main(String args[])
    {
    try
     {
        FileWriter qfile=new FileWriter("D:Rivesh.txt");
        qfile.write("my name is rivesh karnwal");
        qfile.close();
        System.out.println("content wrote into the file");
    }
    catch(IOException exception)
    {
        System.out.println("error occured");
        exception.printStackTrace();
    }
}
}
*/

//wap to read a file...
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class Readfromafile
{
    public static void main(String args[])
    {
        try
        {
          File t1=new File("D:Rivesh.txt");
          Scanner datareader=new Scanner(t1);
          while(datareader.hasNextLine())
          {
              String filedata=datareader.nextLine();
              System.out.println(filedata);
          } 
          datareader.close();
        }
        catch(IOException exception)
        {
            System.out.println("file not found");
            exception.printStackTrace();
        }
    }
}