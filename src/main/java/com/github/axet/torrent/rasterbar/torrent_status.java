package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:182</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class torrent_status extends Structure {
	/**
	 * @see state_t<br>
	 * C type : state_t
	 */
	public int state;
	public int paused;
	public float progress;
	/// C type : char[1024]
	public byte[] error = new byte[1024];
	public int next_announce;
	public int announce_interval;
	/// C type : char[512]
	public byte[] current_tracker = new byte[512];
	public long total_download;
	public long total_upload;
	public long total_payload_download;
	public long total_payload_upload;
	public long total_failed_bytes;
	public long total_redundant_bytes;
	public float download_rate;
	public float upload_rate;
	public float download_payload_rate;
	public float upload_payload_rate;
	public int num_seeds;
	public int num_peers;
	public int num_complete;
	public int num_incomplete;
	public int list_seeds;
	public int list_peers;
	public int connect_candidates;
	public int num_pieces;
	public long total_done;
	public long total_wanted_done;
	public long total_wanted;
	public float distributed_copies;
	public int block_size;
	public int num_uploads;
	public int num_connections;
	public int uploads_limit;
	public int connections_limit;
	/// enum storage_mode_t storage_mode;
	public int up_bandwidth_queue;
	public int down_bandwidth_queue;
	public long all_time_upload;
	public long all_time_download;
	public int active_time;
	public int seeding_time;
	public int seed_rank;
	public int last_scrape;
	public int has_incoming;
	public int sparse_regions;
	public int seed_mode;
	public torrent_status() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"state", "paused", "progress", "error", "next_announce", "announce_interval", "current_tracker", "total_download", "total_upload", "total_payload_download", "total_payload_upload", "total_failed_bytes", "total_redundant_bytes", "download_rate", "upload_rate", "download_payload_rate", "upload_payload_rate", "num_seeds", "num_peers", "num_complete", "num_incomplete", "list_seeds", "list_peers", "connect_candidates", "num_pieces", "total_done", "total_wanted_done", "total_wanted", "distributed_copies", "block_size", "num_uploads", "num_connections", "uploads_limit", "connections_limit", "up_bandwidth_queue", "down_bandwidth_queue", "all_time_upload", "all_time_download", "active_time", "seeding_time", "seed_rank", "last_scrape", "has_incoming", "sparse_regions", "seed_mode"});
	}
	public static class ByReference extends torrent_status implements Structure.ByReference {
		
	};
	public static class ByValue extends torrent_status implements Structure.ByValue {
		
	};
}
