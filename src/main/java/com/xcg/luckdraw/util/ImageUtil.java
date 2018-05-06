package com.xcg.luckdraw.util;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageDecoder;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import sun.awt.image.PNGImageDecoder;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * 图片处理工具类
 *
 * @author xuchenguang
 * @since 2018-5-5
 */
public class ImageUtil {
    /**
     * 图片加图片
     *
     * @param ImagePath1    主图
     * @param ImagePath2    附图
     * @param x             坐标x
     * @param y             坐标y
     * @param shareFileName 输出路径及名称格式
     */
    public static void getImage(String ImagePath1, String ImagePath2, int x, int y, String shareFileName) {
        try {
            //主图
            InputStream is = new FileInputStream(ImagePath1);
            //通过JPEG图象流创建JPEG数据流解码器
            JPEGImageDecoder jpegDecoder = JPEGCodec.createJPEGDecoder(is);
            //解码当前JPEG数据流，返回BufferedImage对象
            BufferedImage buffImg = jpegDecoder.decodeAsBufferedImage();
//            System.out.println("主图的宽：" + buffImg.getWidth());
//            System.out.println("主图的高：" + buffImg.getHeight());

            //得到画笔对象
            Graphics2D g = (Graphics2D) buffImg.getGraphics();

            //创建你要附加的图象。
            //小图片的路径
            ImageIcon imgIcon = new ImageIcon(ImagePath2);
            //得到Image对象。
            Image img = imgIcon.getImage();
            //将小图片绘到大图片上。
            g.drawImage(img, x, y, null);

            //设置颜色。
            g.setColor(Color.BLACK);

            OutputStream os = new FileOutputStream(shareFileName);
            //创键编码器，用于编码内存中的图象数据。
            JPEGImageEncoder en = JPEGCodec.createJPEGEncoder(os);
            en.encode(buffImg);

            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param ImagePath1 主图
     * @param font 字体
     * @param style 样式
     * @param fontSize 字体大小
     * @param color 字体颜色
     * @param text 内容
     * @param x 坐标x
     * @param y 坐标y
     * @param shareFileName 输出目录
     */
    public static void getText(String ImagePath1,
                               String font,
                               int style,
                               int fontSize,
                               Color color,
                               String text,
                               int x,
                               int y,
                               String shareFileName) {
        try {
            //主图
            InputStream is = new FileInputStream(ImagePath1);
            //通过JPEG图象流创建JPEG数据流解码器
            JPEGImageDecoder jpegDecoder = JPEGCodec.createJPEGDecoder(is);
            //解码当前JPEG数据流，返回BufferedImage对象
            BufferedImage buffImg = jpegDecoder.decodeAsBufferedImage();

            //得到画笔对象
            Graphics2D g = (Graphics2D) buffImg.getGraphics();

            //最后一个参数用来设置字体的大小
            Font f = new Font(font, style, fontSize);
            g.setColor(color);
            g.setFont(f);
            //10,20 表示这段文字在图片上的位置(x,y) .第一个是你设置的内容。
            g.drawString(text, x, y);
            g.dispose();


            OutputStream os = new FileOutputStream(shareFileName);
            //创键编码器，用于编码内存中的图象数据。
            JPEGImageEncoder en = JPEGCodec.createJPEGEncoder(os);
            en.encode(buffImg);

            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
