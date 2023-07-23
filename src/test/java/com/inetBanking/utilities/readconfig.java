package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
         Properties pro;
         public readconfig()
         {
        	 
          File src = new File("./Configurations/config.properties");
        try {
               FileInputStream fl = new FileInputStream(src);
               pro = new Properties();
               pro.load(fl);
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
         }
         public String getapplicationurl()
         {
        	 String url = pro.getProperty("URL");
        	 return url;
         }
         public String getusername()
         {
         String name = pro.getProperty("USERNAME");
             return name;
          }
         public String getpassword()
         {
        	 String pw = pro.getProperty("PASSWORD");
        	 return pw;
         }
         public String getcpath()
         {
        	 String path = pro.getProperty("CHROMEPATH");
        	 return path;
         }
         public String getc1path()
         {
        	 String path = pro.getProperty("FIREFOX");
        	 return path;
         }
         }
