package com.example.ffmpegsdlplayer.mediacodec;


/**
 * 编码接口
 * @author chenyang
 *
 */
public interface Encoder extends Codec {

	/**
	 * 打开编码器
	 */
	public void open();

	/**
	 * 关闭编码器
	 */
	public void close();
	
	/**
	 * 编码方法
	 * @param in 待编码数组
	 * @param offset 待编码数组偏移量
	 * @param out 编码后数组
	 * @param length 待编码长度
	 * @return 编码后长度
	 */
	public int encode(byte[] in, int offset, byte[] out, int length);
}