package hung.dev;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Indssv {
public static void main(String[] args) throws Exception {
FileInputStream fis =new FileInputStream("in.txt");
BufferedReader br =new BufferedReader(new InputStreamReader(fis));
String line;
while ((line=br.readLine())!=null){
System.out.println(line);
}
br.close();
}
}