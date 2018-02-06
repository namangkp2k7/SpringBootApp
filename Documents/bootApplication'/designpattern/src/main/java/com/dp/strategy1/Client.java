package com.dp.strategy1;

import java.io.File;
import java.util.ArrayList;

public class Client {

	// List<File> fileList = new ArrayList<File>();

	public static void main(String[] args) {
		ArrayList<File> fileList = new ArrayList<File>();
		CompressionContext ctx = new CompressionContext();

		// we could assume context is already set by preferences

		ctx.setCompressionStrategy(new ZipCompressionStrategy());

		//ctx.setCompressionStrategy(new RarCompressionStrategy());
		
		// get a list of files...

		ctx.createArchive(fileList);

	}
}
