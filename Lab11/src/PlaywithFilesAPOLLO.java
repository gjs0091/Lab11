import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PlaywithFilesAPOLLO {

	public static void main(String[] args) throws IOException {
		
		

		
		
		
			
			
		Path p1 = Paths.get("C:\\Backup\\APOLLO\\APOLLO_20171102_1of4.txt");
		
		boolean full = true;
		for(int x = 1; x < 4;x++) {
		p1 = Paths.get("C:\\Users\\gjs0091\\Desktop\\workspace\\Lab11\\Backup\\APOLLO\\APOLLO_20171102_"+ x + "of4.txt");
		if(Files.exists(p1)) {
			
		} else full = false;
		}
		
		if(full) System.out.println("All files present"); else System.out.println("All files not present");
		
	}

}