package demo1;

import javax.swing.*;
import java.net.URL;

/**
 * 封装图片
 */
public class Images {
    //  将图片的路径封装为URL对象
    public static URL bodyURL =  Images.class.getResource("/images/big/body1.png");  // 返回该文件的绝对路径的URL对象
    //  将图片封装为ImageIcon对象
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);  // 可以传入一个图片的URL对象

    public static URL upURL =  Images.class.getResource("/images/big/up2.png");
    public static ImageIcon upImg = new ImageIcon(upURL);

    public static URL downURL =  Images.class.getResource("/images/big/down2.png");
    public static ImageIcon downImg = new ImageIcon(downURL);

    public static URL leftURL =  Images.class.getResource("/images/big/left2.png");
    public static ImageIcon leftImg = new ImageIcon(leftURL);

    public static URL rightURL =  Images.class.getResource("/images/big/right2.png");
    public static ImageIcon rightImg = new ImageIcon(rightURL);

    public static URL foodURL =  Images.class.getResource("/images/big/food1.png");
    public static ImageIcon foodImg = new ImageIcon(foodURL);

    public static URL headerURL =  Images.class.getResource("/images/big/header.jpg");
    public static ImageIcon headerImg = new ImageIcon(headerURL);

    public static URL muaURL =  Images.class.getResource("/images/mua.jpg");
    public static ImageIcon muaImg = new ImageIcon(muaURL);
}
