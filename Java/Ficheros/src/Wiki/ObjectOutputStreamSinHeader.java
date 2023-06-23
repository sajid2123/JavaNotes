package Wiki;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamSinHeader extends ObjectOutputStream{

    public ObjectOutputStreamSinHeader(OutputStream out) throws IOException {
        super(out);
        //TODO Auto-generated constructor stub
    }

    protected void writeStreamHeader() throws IOException{
    // No hacer nada.
    }
    
}
