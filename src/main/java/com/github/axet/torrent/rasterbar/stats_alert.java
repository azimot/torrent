package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:530</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class stats_alert extends Structure {
	/// C type : torrent_alert
	public torrent_alert torrent_alert;
	/**
	 * number of stats_channel, stats_channel_max. jnaerator 0.9.7 unable to parse transferred[stats_channel_max];<br>
	 * C type : int[10]
	 */
	public int[] transferred = new int[10];
	public int interval;
	public stats_alert() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"torrent_alert", "transferred", "interval"});
	}
	/**
	 * @param torrent_alert C type : torrent_alert<br>
	 * @param transferred number of stats_channel, stats_channel_max. jnaerator 0.9.7 unable to parse transferred[stats_channel_max];<br>
	 * C type : int[10]
	 */
	public stats_alert(torrent_alert torrent_alert, int transferred[], int interval) {
		super();
		this.torrent_alert = torrent_alert;
		if (transferred.length != this.transferred.length) 
			throw new IllegalArgumentException("Wrong array size !");
		this.transferred = transferred;
		this.interval = interval;
	}
	public static class ByReference extends stats_alert implements Structure.ByReference {
		
	};
	public static class ByValue extends stats_alert implements Structure.ByValue {
		
	};
}