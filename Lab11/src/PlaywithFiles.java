import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.io.File;
public class PlaywithFiles {

	public static void main(String[] args) throws IOException {
		File f = null;
		File[] paths;
		f = new File("C:Lab11\\Backup\\SPEED")
				
		Path p1 = Paths.get("C:\\Lab11\\Backup\\SPEED\\SPEED_20171102_2of10.txt.txt");
		Path p2 = Paths.get("C:\\Backup");
		
		for (File child : directoryListing) {
		      
		    }
		System.out.format("getFileName: %s%n", p1.getFileName());
		System.out.format("getRoot: %s%n", p2.getRoot());
		
		
		
	
		//Files.delete(p1);
		
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:SPEED_20171102_2_of10.txt.txt");
		
		Path filename = p1.getFileName();
		if(matcher.matches(filename)) 
			System.out.println(filename);
		else
			System.out.println("no match");
			
		
	}

}