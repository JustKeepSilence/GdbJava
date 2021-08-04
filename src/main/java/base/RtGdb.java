package base;

import java.nio.ByteBuffer;

public interface RtGdb {
    public void BatchWrite(ByteBuffer keys, ByteBuffer values) throws Exception;
    public ByteBuffer BatchFetch(ByteBuffer keys) throws Exception;
    public void Sync();
    public Void Load(Object... params) throws Exception;
}
