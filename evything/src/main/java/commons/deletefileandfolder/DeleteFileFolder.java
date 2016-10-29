package commons.deletefileandfolder;

import java.io.File;

/**
 * Created by sfeng on 2016/10/29.
 */
public class DeleteFileFolder {


    public void deleteAll(String path){
        File f=new File(path);
        System.out.println(f.exists());
        if(f.exists()&&f.isDirectory()){
           if(f.listFiles().length==0){
               f.delete();
           }else{
               File[] fs=f.listFiles();
               for(int i=0;i<fs.length;i++){
                   if(fs[i].isDirectory()){
                       deleteAll(fs[i].getAbsolutePath());
                   }
                   fs[i].delete();
               }
           }
        }
    }

    public static void main(String[] args) {
        DeleteFileFolder deleteFileFolder=new DeleteFileFolder();

        deleteFileFolder.deleteAll("d:\\test");
    }
}
