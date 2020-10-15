package de.ladam.generator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.UUID;

public class UUIDGenerator {
	public static void main(String[] args) {
		UUID s = UUID.randomUUID();;
		System.out.println("UUID has been generated and copied to clipboard");
		System.out.println("================================================");
		System.out.println(s);
		System.out.println("================================================");
		StringSelection selection = new StringSelection(s.toString());
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
	}
}
