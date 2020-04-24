package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        inputFilePath = "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt";
        outputFilePath = "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt";
        MyDatabase bd=new MyDatabase();
        URL url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        EncodingModule encodeWithFiles = new encodeWithFiles(inputFilePath,outputFilePath);
        EncodingModule encodeBasedOnNetworkAndDatabase = new encodeBasedOnNetworkAndDatabase(url,bd);
        encodeWithFiles.encode();
        encodeBasedOnNetworkAndDatabase.encode();
    }
}
