package com.echo.adapter;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/28 13:48
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: DemoTest
 * 文件描述: [
 *      设计模式：适配器设计模式
 *      特性：两个不兼容接口之间的桥梁
 * ]
 * version：1.0
 *
 ********************************************************/
public class DemoTest {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the moon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
