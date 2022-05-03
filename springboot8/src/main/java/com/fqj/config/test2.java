package com.fqj.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //命令分割
        Map<String,Boolean> SoMap = new HashMap<String,Boolean>();

        String[] input = bf.readLine().split(";");
        String[] sonames = new String[input.length];
        Map<String, String>[] echundif = new Map[sonames.length];
        Map<String, String>[] noif = new Map[sonames.length];
        for(int i = 0;i < input.length;i++){
            String[] split = input[i].split(".");
            sonames[i] = split[0];
        }
        //内容分割 in each input
        for(int i = 0;i < input.length;i++){
            String[] strings = input[i].split(":");
            String[] keys = strings[1].split(",");
            //用空格分开
            for(int j = 0;j < keys.length;j++){
                String[] mappers = keys[j].split(" ");
                //特定文件的点
                echundif[i].put(mappers[0],sonames[i]);
                if(mappers[1].equals("Y")){
                    if(SoMap.get(mappers[0]) == null){
                        SoMap.put(mappers[0],true);
                    }else if(!SoMap.get(mappers[0])){
                        SoMap.put(mappers[0], true);
                    }
                }else if(mappers[1].equals("N")){
                    if(SoMap.get(mappers[0]) == null){
                        SoMap.put(mappers[0],false);
                    }
                }

            }
        }
        Iterator<String> iterator = SoMap.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            if(!SoMap.get(key)){
                for(int i = 0;i < sonames.length;i++){
                    if(!echundif[i].containsKey(key)){
                        noif[i].put(key,sonames[i]);
                    }
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append("OUT:");
        for(int i = 0;i < sonames.length;i++){
            sb.append(sonames[i] + ".so:");
            Iterator<String> iterator1 = noif[i].keySet().iterator();
            while(iterator1.hasNext()){
                String next = iterator1.next();
                sb.append(next + ',');
            }
            sb.setCharAt(sb.length() - 1,';');
        }
        sb.subSequence(0,sb.length() - 1);
        System.out.println(sb.toString());
    }
}
