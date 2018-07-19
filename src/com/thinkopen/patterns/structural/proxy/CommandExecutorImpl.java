package com.thinkopen.patterns.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		cmd = cmd.trim();

		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' comando eseguito.");
	}
}
