package web.spring.chatick.domain;

public class ChatRoomVO {
	private String chatroom_id;
	private String USER_user_id;
	private String TUTOR_USER_user_id;
	private int CLASS_class_id;
	
	public ChatRoomVO() {
		// TODO Auto-generated constructor stub
	}

	public ChatRoomVO(String chatroom_id, String USER_user_id, String TUTOR_USER_user_id, int CLASS_class_id) {
		super();
		this.chatroom_id = chatroom_id;
		this.USER_user_id = USER_user_id;
		this.TUTOR_USER_user_id = TUTOR_USER_user_id;
		this.CLASS_class_id = CLASS_class_id;
	}

	public String getChatroom_id() {
		return chatroom_id;
	}

	public void setChatroom_id(String chatroom_id) {
		this.chatroom_id = chatroom_id;
	}

	public String getUSER_user_id() {
		return USER_user_id;
	}

	public void setUSER_user_id(String USER_user_id) {
		this.USER_user_id = USER_user_id;
	}

	public String getTUTOR_USER_user_id() {
		return TUTOR_USER_user_id;
	}

	public void setTUTOR_USER_user_id(String TUTOR_USER_user_id) {
		this.TUTOR_USER_user_id = TUTOR_USER_user_id;
	}

	public int getCLASS_class_id() {
		return CLASS_class_id;
	}

	public void setCLASS_class_id(int CLASS_class_id) {
		this.CLASS_class_id = CLASS_class_id;
	}
	
	
	
	
	

}
