package ProxyPattern.example;

import ProxyPattern.example.Searcher.ProxySearcher;
import ProxyPattern.example.Searcher.Searcher;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Searcher searcher = new ProxySearcher();
        String result = searcher.DoSearch("杨过","玉女心经");
        System.out.print(result);
    }
}
