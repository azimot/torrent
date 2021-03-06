package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:498</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class storage_moved_alert extends Structure {
	/// C type : torrent_alert
	public torrent_alert torrent_alert;
	/// C type : const char*
	public Pointer path;
	public storage_moved_alert() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"torrent_alert", "path"});
	}
	/**
	 * @param torrent_alert C type : torrent_alert<br>
	 * @param path C type : const char*
	 */
	public storage_moved_alert(torrent_alert torrent_alert, Pointer path) {
		super();
		this.torrent_alert = torrent_alert;
		this.path = path;
	}
	public static class ByReference extends storage_moved_alert implements Structure.ByReference {
		
	};
	public static class ByValue extends storage_moved_alert implements Structure.ByValue {
		
	};
}
