package lesson_9.files_and_nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;

public class ChannelsNio {
    public static void main(String[] args) {
        fileChannelWrite();
        fileChannelRead();
    }

    public static void fileChannelWrite() {
        try (RandomAccessFile accessFile = new RandomAccessFile("src/main/resources/nio-data.txt", "rw")) {
            FileChannel fileChannel = accessFile.getChannel();
            String newData = "Кто убил Кэннеди?";

            ByteBuffer buf = ByteBuffer.allocate(48);
            buf.clear();
            buf.put(newData.getBytes());

            buf.flip();

            while (buf.hasRemaining()) {
                fileChannel.write(buf);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void fileChannelRead() {
        try (RandomAccessFile aFile = new RandomAccessFile("src/main/resources/nio-data.txt", "rw")) {
            FileChannel inChannel = aFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(48);

            int bytesRead = inChannel.read(buf);
            while (bytesRead != -1) {

                System.out.println("Read " + bytesRead);
                buf.flip();

                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }

                buf.clear();
                bytesRead = inChannel.read(buf);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void datagramChannel() {
        try (DatagramChannel channel = DatagramChannel.open()) {
            channel.socket().bind(new InetSocketAddress(1111));

            ByteBuffer receiveBuffer = ByteBuffer.allocate(48);
            receiveBuffer.clear();

            //получение данных
            channel.receive(receiveBuffer);

            String newData = "New String to write to file..."
                    + System.currentTimeMillis();

            ByteBuffer sendBuffer = ByteBuffer.allocate(48);
            sendBuffer.clear();
            sendBuffer.put(newData.getBytes());
            sendBuffer.flip();

            //int bytesSent = channel.send(sendBuffer, new InetSocketAddress("site.com", 80));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
