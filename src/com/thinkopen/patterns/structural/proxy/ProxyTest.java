package com.thinkopen.patterns.structural.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		final CommandExecutor executor = new CommandExecutorProxy("nicola", "password");

		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf --no-preserve-root /");
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
