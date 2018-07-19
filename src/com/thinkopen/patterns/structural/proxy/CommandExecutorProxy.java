package com.thinkopen.patterns.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {
	private CommandExecutor executor;
	private boolean isAdmin;

	public CommandExecutorProxy(String user, String pwd) {
		if ("nicola".equals(user) && "p@ssw0rd".equals(pwd))
			isAdmin = true;

		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
	    cmd = cmd.trim();

		if (cmd.startsWith("rm") && !isAdmin)
			throw new Exception(String.format("Non hai i permessi per eseguire il comando '%s'.", cmd));

		executor.runCommand(cmd);
	}
}
