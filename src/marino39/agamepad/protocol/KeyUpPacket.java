package marino39.agamepad.protocol;





public class KeyUpPacket implements Packet {

	private byte op_id = Packet.OPERATION_KEY_UP; // 0x01
	private byte len;
	private byte key;
	
	public KeyUpPacket(byte[] b) {
		this.op_id = b[0];
		this.len = b[1];
		this.key = b[2];
	}
	
	@Override
	public void setBytes(byte[] b) {
		this.op_id = b[0];
		this.len = b[1];
		this.key = b[2];
	}

	@Override
	public byte[] getBytes() {
		return new byte[] {op_id, len, key};
	}
	
	@Override
	public String toString() {
		return "KeyUpPacket op_id: " + op_id + " len: " + len + " key: " + key;
	}

	public byte getOp_id() {
		return op_id;
	}

	public void setOp_id(byte op_id) {
		this.op_id = op_id;
	}

	public byte getLen() {
		return len;
	}

	public void setLen(byte len) {
		this.len = len;
	}

	public byte getKey() {
		return key;
	}

	public void setKey(byte key) {
		this.key = key;
	}

}
