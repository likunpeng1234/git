package com.likunpeng.shiyan1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String curPath = new String();
        while (true) {
            String op = s.next();
            switch (op) {
                case "create":
                    String pathCreate = s.next();
                    String nameCreate = s.next();
                    CreateFile create = new CreateFile(pathCreate, nameCreate);
                    create.createFile(pathCreate, nameCreate);
                    break;
                case "rm":
                    File dir = new File(s.next());
                    if (dir.exists() && dir.isDirectory()) {
                        DeleteFile delete = new DeleteFile(dir);
                        delete.delete(dir);
                        System.out.println("删除成功!");
                    } else
                        System.out.println("找不到文件路径" + dir);
                    break;
                case "cd":
                    curPath = s.next();
                    File test = new File(curPath);
                    if (!test.exists())
                        System.out.println("路径有错误！");
                    break;
                case "ls":
                    File dirList = new File(curPath);
                    if (dirList.isDirectory() && dirList.exists()) {
                        ListFile list = new ListFile(dirList);
                        list.listFile(dirList);
                    } else
                        System.out.println("默认路径为空！");
                    break;
                case "cp":
                    String src = s.next();
                    String des = s.next();
                    CopyFile copy = new CopyFile(src, des);
                    copy.copyFile(src, des);
                    break;
                case "encrypt":
                    String pathEn = s.next();
                    EncryptFile encrypt = new EncryptFile(pathEn);
                    encrypt.encryptFile(pathEn);
                    break;
                case "decrypt":
                    String pathDe = s.next();
                    DecryptFile decrypt = new DecryptFile(pathDe);
                    decrypt.decryptFile(pathDe);
                    break;
                case "help":
                    System.out.println("帮助文档：");
                    System.out.println("创建文件夹 格式        create    文件夹路径    文件夹名称 ");
                    System.out.println("删除文件夹 格式        rm    文件夹路径");
                    System.out.println("进入文件夹  格式        cd    文件夹路径");
                    System.out.println("当前文件夹下的内容罗列 格式        ls ");
                    System.out.println("复制文件或文件夹 格式        cp    原路径  目地路径");
                    System.out.println("文件加密 格式        encrypt 文件路径");
                    System.out.println("文件解密 格式        decrypt 文件路径");
                    System.out.println("文件或文件夹的压缩 格式        compress 文件或文件夹路径");
                    System.out.println("解压  格式        decompress 压缩包路径    解压目地路径");
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
