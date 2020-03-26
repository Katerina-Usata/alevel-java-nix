package com.alevel.java.nix.homework.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecursiveCopying {
	private static final String SRC_DIR = String.format("C:\\Projectsnull");
	private static final String DST_DIR = String.format("C:\\Projects");
	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {
		new RecursiveCopying().copy(SRC_DIR, DST_DIR);
	}

	private boolean copy(final String src, final String dst) {
		System.out.println("Koпиpyem kaтaлoг: " + src);
		final File srcFile = new File(src);
		final File dstFile = new File(dst);
		if (srcFile.exists() && srcFile.isDirectory() && !dstFile.exists()) {
			dstFile.mkdir();
			File nextSrcFile;
			String nextSrcFilename, nextDstFilename;
			for (String filename : srcFile.list()) {
				nextSrcFilename = srcFile.getAbsolutePath() + File.separator + filename;
				nextDstFilename = dstFile.getAbsolutePath() + File.separator + filename;
				nextSrcFile = new File(nextSrcFilename);
				if (nextSrcFile.isDirectory()) {
					copy(nextSrcFilename, nextDstFilename);
				} else {
					copyFile(nextSrcFilename, nextDstFilename);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private boolean copyFile(final String src, final String dst) {
		System.out.println("Koпиpyem фaйл: " + src);
		final File srcFile = new File(src);
		final File dstFile = new File(dst);
		if (srcFile.exists() && srcFile.isFile() && !dstFile.exists()) {
			try (InputStream in = new FileInputStream(srcFile);
				 OutputStream out = new FileOutputStream(dstFile)) {
				byte[] buffer = new byte[BUFFER_SIZE];
				int bytes;
				while ((bytes = in.read(buffer)) > 0) {
					out.write(buffer, 0, bytes);
				}
			} catch (FileNotFoundException ex) {
				Logger.getLogger(RecursiveCopying.class.getName())
					  .log(Level.SEVERE, null, ex);
				return false;
			} catch (IOException ex) {
				Logger.getLogger(RecursiveCopying.class.getName())
					  .log(Level.SEVERE, null, ex);
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
