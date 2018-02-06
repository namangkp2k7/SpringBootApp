package com.dp.strategy1;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy{

	@Override
	public void compressFiles(ArrayList<File> files) {
		// TODO Auto-generated method stub
		
		System.out.println("ZIP");
		
	}

}
