package alarcos.patrones.composite.examples.directories;

import java.util.ArrayList;

/**
 * Created by luisburgos on 18/07/15.
 */
public class MyDirectory{

	private String name;
	private static StringBuffer identado = new StringBuffer();
	private ArrayList<MyDirectory> directories;
	private ArrayList<MySImpleFile> files;

    public MyDirectory (String name) {
        this.name = name;
        directories = new ArrayList<>();
        files = new ArrayList<>();
    }

    public void addDirectory(MyDirectory file) {
        directories.add(file);
    }

    public void removeDirectory(MyDirectory file) {
        directories.remove(file);
    }
    
    public void addFile(MySImpleFile file) {
        files.add(file);
    }

    public void removeFile(MySImpleFile file) {
        files.remove(file);
    }




}