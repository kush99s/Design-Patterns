package Composite;

import java.util.ArrayList;

import Component.FileSystem;

public class Directory implements FileSystem {

	String directory;
	ArrayList<FileSystem> fileSystem=new ArrayList<>();
	
	public Directory(String directory) {
		this.directory=directory;
		fileSystem=new ArrayList<>();
	}
	
	public void add(FileSystem fileObj) {
		fileSystem.add(fileObj);
	}

	@Override
	public void ls() {
		System.out.println("Inside directory: "+directory);
		fileSystem.forEach(fileObj->{
			fileObj.ls();
		});

	}

}
