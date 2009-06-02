package net.rubyeye.xmemcached.command;

import java.util.concurrent.CountDownLatch;

public abstract class DeleteCommand extends Command {

	protected int time;

	public DeleteCommand(String key, byte[] keyBytes, int time,final CountDownLatch latch) {
		super(key, keyBytes,latch);
		this.commandType = CommandType.DELETE;
		this.time = time;
	}

	public final int getTime() {
		return time;
	}

	public final void setTime(int time) {
		this.time = time;
	}

}