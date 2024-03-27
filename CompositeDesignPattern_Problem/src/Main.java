import Component.FileSystem;
import Composite.Directory;
import Leaf.File;

public class Main {

	public static void main(String args[]) {
		Directory movieDir=new Directory("Movie");
		FileSystem avengers=new File("Avengers");
		movieDir.add(avengers);
		
		Directory comedyDir=new Directory("Comedy Movie");
		FileSystem thor=new File("Thor");
		comedyDir.add(thor);
		
		movieDir.add(comedyDir);
		movieDir.ls();
	}

}
