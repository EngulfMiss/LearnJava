package LearnJava.File.FileFilter;

import java.io.File;
import java.io.FileFilter;

/*
    返回true：不过滤
    返回false：过滤
 */

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".js");
    }
}
