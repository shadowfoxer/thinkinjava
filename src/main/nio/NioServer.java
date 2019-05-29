package main.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * 慕课
 *
 * @author
 * @create 2019-05-26 下午5:27
 **/
public class NioServer {


    public void start() throws IOException {
        /**
         * 1.建立selector
         */
        Selector selector = Selector.open();

        /**
         * 2.建立channel
         */

        ServerSocketChannel channel = ServerSocketChannel.open();

        /**
         * 3.绑定socket
         */
        channel.bind(new InetSocketAddress(8000));

        /**
         * 4.设置channel为非阻塞
         */
        channel.configureBlocking(false);
        /**
         * 5.chennel注册到selector上
         */
        channel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务器启动成功");
        /**
         * 6.循环等待新接入连接
         */

        for (;;){
            int readyChannel = selector.select();
            if(readyChannel == 0){
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();

            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();
                iterator.remove();




        /**
         * 7.根据就绪状态处理逻辑
         */
                /**
                 * 接入事件
                 */
                if(selectionKey.isAcceptable()){
                    acceptHandler(channel,selector);
                }

                if(selectionKey.isReadable()){
                    readHandler(selectionKey,selector);
                }



            }

        }

    }

    /**
     * 接入事件处理器
     *
     */
    private void acceptHandler(ServerSocketChannel serverSocketChannel,Selector selector) throws IOException {

        /**
         * 如果是接入事件，创建socketchannel
         */

        SocketChannel socketChannel = serverSocketChannel.accept();

        /**
         * 设置非阻塞模式
         */

        socketChannel.configureBlocking(false);

        /**
         * 将channel注册到selector上，监听可读事件
         */

        socketChannel.register(selector,SelectionKey.OP_READ);

        /**
         * 回复客户端信息
         */
//        socketChannel.write(Charset.forName("UTF-8",).encode("欢迎欢迎"));

    }

    /**
     * 可读事件处理器
     */
    private void readHandler(SelectionKey selectionKey ,Selector selector) throws IOException {

        /**
         * 从selectKey中获取已经就绪的channel
         */
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();


        /**
         * 创建buffer
         */

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        /**
         * 循环读取客户端请求信息
         */

        String request = "";

        while (socketChannel.read(buffer) > 0){
            buffer.flip();
            request += Charset.forName("UTF-8").decode(buffer);
        }

        /**
         * 将channel再次注册到selector上，监听他的可读事件
         */

        socketChannel.register(selector,SelectionKey.OP_READ);

        /**
         * 将客户端发送的请求信息，广播给其他客户端
         */

        if(request.length()>0){
            System.out.println("读取到消息");
        }

    }


}
