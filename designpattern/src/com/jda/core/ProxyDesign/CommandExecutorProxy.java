package com.jda.core.ProxyDesign;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("Apoorva".equals(user) && "passw0rd".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");
			} else {
				executor.runCommand(cmd);
			}
		}
	}

}
