package org.ntutssl.document;

public class Main {
	public static void main(String[] args) {
		Editor editor = new Editor();
		new InstructionHandler(editor).run();
	}
}
