package io.renren.oss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 文件上传Factory
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-26 10:18
 */
public final class OSSFactory {

    public static String upload(byte[] uploadFile, String filename) {
        String filePath = "";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            fos.write(uploadFile);
            fos.close();
            filePath = new File(filename).getAbsolutePath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            return filePath;
        }
    }

}
