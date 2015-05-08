package diapositivas;

import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.*;	 
public class Filtro  extends FileFilter {
	    //Accept all directories and all gif, jpg, tiff, or png files.
	    public boolean accept(File f) {
	        if (f.isDirectory()) {
	            return true;
	        }
	        String ext = null;
	        String s = f.getName();
	        int i = s.lastIndexOf('.');
	 
	        if (i > 0 &&  i < s.length() - 1) {
	            ext = s.substring(i+1).toLowerCase();
	        }
	        if (ext != null) {
	            if (ext.equals("txt"))
	                    return true;
	           else {
	                return false;
	            }
	        }
	 
	        return false;
	   }

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "Texto";
		}

}	
