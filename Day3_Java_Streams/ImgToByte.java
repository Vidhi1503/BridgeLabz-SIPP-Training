package Day3_Java_Streams;

import java.io.*;
class ImgToByte {
    public static void main(String[] a)throws Exception {
        byte[] data;
        try(ByteArrayOutputStream bos=new ByteArrayOutputStream();
            FileInputStream in=new FileInputStream("pic.jpg")){
            byte[] buf=new byte[1024]; int n;
            while((n=in.read(buf))!=-1) bos.write(buf,0,n);
            data=bos.toByteArray();
        }
        try(ByteArrayInputStream bis=new ByteArrayInputStream(data);
            FileOutputStream out=new FileOutputStream("pic_copy.jpg")){
            int b; while((b=bis.read())!=-1) out.write(b);
        }
        System.out.println("Image copied.");
    }
}
