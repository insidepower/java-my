import java.io.*;
import java.util.*;

public class FileListFilter {
	public ArrayList<File> listFiles(String path) {
		final ArrayList<File> directory_list = new ArrayList<File>();
		final ArrayList<File> results = new ArrayList<File>();
		FileFilter filter = new FileFilter() {
			@Override
			public boolean accept(File myfile){
				if(!myfile.isFile() || !myfile.getName().endsWith("apk")){
					return false;
				}else {
					results.add(myfile);
					return true;
				}
			}
		};

		try {
			File directory = new File(path);
			directory.listFiles(filter);
		} catch (NullPointerException e) {
			System.err.println("NullPointerException: " + e.getMessage());
		}

		return results;
	}

	public static void main (String args[]) {
		FileListFilter fl = new FileListFilter();
		String path = "/media/knxy/Software/android_apk";
		ArrayList<File> files = fl.listFiles(path);

		for ( File myfile : files ){
			System.out.println(myfile);
		}
	}
}
