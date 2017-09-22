import java.util.*;
import java.io.File;
import java.util.regex.*;
import java.io.FileInputStream;

public class NoteReader {
    
    public boolean reader (String dir, String keyword){
    
        File path = new File(dir); 

if(path.exists()) 
{ 
  Pattern p = Pattern.compile(keyword); 
  ArrayList<String> list = new ArrayList<String>(); 

  for(File f : path.listFiles())
  {
    if(!f.isFile()) continue;
    try
    {
      FileInputStream fis = new FileInputStream(f);
      byte[] data = new byte[fis.available()];
      fis.read(data);
      String text = new String(data);
      Matcher m = p.matcher(text);
      if(m.find())
      {
        list.add(f.getName());
      }
      fis.close();
    } 
    catch(Exception e)
    {
      System.out.println("\t Error processing file : "+f.getName());
    }

  }
  System.out.println("\t List : "+list); 
} 
else
{
  System.out.println("Path does not exist.");
    
}
return true;
}
    
    
    public boolean reader2(String dir, String keyword){
        
        File path = new File(dir);
  
if(path.exists()) 
{ 
  Pattern p = Pattern.compile(keyword); 
  ArrayList<String> list = new ArrayList<String>(); 
  ArrayList<String> c = new ArrayList<String>();

  for(File f : path.listFiles())
  {
    if(!f.isFile()) continue;
    try
    {
      FileInputStream fis = new FileInputStream(f);
      byte[] data = new byte[fis.available()];
      fis.read(data);
      String text = new String(data);
      Matcher m = p.matcher(text);
      while(m.find())
      {
        c.add(f.getName());
      }
      fis.close();
    } 
    catch(Exception e)
    {
      System.out.println("\t Error processing file : "+f.getName());
    }

  }
  int counter = 0;
  String temp;
  for(File g: path.listFiles()) {
	  counter = Collections.frequency(c, g.getName());
	  temp = Integer.toString(counter) +" - " + g.getName();
	  list.add(temp);
  }
  Collections.sort(list);
  Collections.reverse(list);
  
  for(String ele : list) {
  System.out.println(ele); 
  }
} 
else
{
  System.out.println("Path does not exist.");
    
}
return true;
}


public boolean reader3(String dir){
    
    File path = new File(dir);

if(path.exists()) 
{ 
Pattern p = Pattern.compile("@"); 
Pattern b = Pattern.compile("#"); 
ArrayList<String> list = new ArrayList<String>(); 
ArrayList<String> c = new ArrayList<String>();

for(File f : path.listFiles())
{
if(!f.isFile()) continue;
try
{
  FileInputStream fis = new FileInputStream(f);
  byte[] data = new byte[fis.available()];
  fis.read(data);
  String text = new String(data);
  Matcher m = p.matcher(text);
  Matcher o = b.matcher(text);
  while(m.find()||o.find())
  {
    c.add(f.getName());
  }
  fis.close();
} 
catch(Exception e)
{
  System.out.println("\t Error processing file : "+f.getName());
}

}
int counter = 0;
String temp;
for(File g: path.listFiles()) {
  counter = Collections.frequency(c, g.getName());
  temp = Integer.toString(counter) +" - " + g.getName();
  list.add(temp);
}
Collections.sort(list);
System.out.println("\t List : "+list); 
} 
else
{
System.out.println("Path does not exist.");

}
return true;
}

public boolean reader4(String dir){
    
    File path = new File(dir);
    

if(path.exists()) 
{ 
Pattern p = Pattern.compile("@");  
ArrayList<String> list = new ArrayList<String>(); 
ArrayList<String> c = new ArrayList<String>();

for(File f : path.listFiles())
{
if(!f.isFile()) continue;
try
{
  FileInputStream fis = new FileInputStream(f);
  byte[] data = new byte[fis.available()];
  fis.read(data);
  String text = new String(data);
  Matcher m = p.matcher(text);
  while(m.find())
  {
    c.add(f.getName());
  }
  fis.close();
} 
catch(Exception e)
{
  System.out.println("\t Error processing file : "+f.getName());
}

}
int counter = 0;
String temp;
for(File g: path.listFiles()) {
  counter = Collections.frequency(c, g.getName());
  temp = Integer.toString(counter) +" - " + g.getName();
  list.add(temp);
}
Collections.sort(list);

	for(String ele : list) {
		System.out.println(ele); 
	}
} 
else
{
System.out.println("Path does not exist.");

}
return true;
}

public boolean reader5(String dir){
    
    File path = new File(dir);
    Set<String> set = new HashSet<String>();

if(path.exists()) 
{ 
	Pattern p = Pattern.compile("#(\\S+)");

for(File f : path.listFiles())
{
if(!f.isFile()) continue;
try
{
  FileInputStream fis = new FileInputStream(f);
  byte[] data = new byte[fis.available()];
  fis.read(data);
  String text = new String(data);
  Matcher m = p.matcher(text);
  
  while(m.find())
  {
	String name = m.group(1);
    set.add(name);
  }
  fis.close();
} 
catch(Exception e)
{
  System.out.println("\t Error processing file : "+f.getName());
}
}
for(String ele : set) {
System.out.println(ele); 
}
} 
else
{
System.out.println("Path does not exist.");

}
return true;
}
}
