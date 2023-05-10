package com.hacklympics.api.proctor;

import com.google.gson.JsonObject;
import com.hacklympics.api.communication.Response;
import com.hacklympics.api.utility.NetworkUtils;

public class Snapshot implements ProctorMedium {
    
    private final int examID;
    private final String studentUsername;
    private final String snapshot;
    private final String timestamp;
    
    public Snapshot(int examID, String studentUsername, String snapshot, String timestamp) {
        this.examID = examID;
        this.studentUsername = studentUsername;
        this.snapshot = snapshot;
        this.timestamp = timestamp;
    }
    
    
    public static Response sync(int courseID, int examID, String student, String b64image) {
        String uri = String.format("course/%d/exam/%d/proctor/sync_snapshot", courseID, examID);
        
        JsonObject json = new JsonObject();
        json.addProperty("student", student);
        json.addProperty("image", b64image);
        
        return new Response(NetworkUtils.post(uri, json.toString()));
    }
    
    
    public int getExamID() {
        return this.examID;
    }
    
    public String getStudentUsername() {
        return this.studentUsername;
    }
    
    public String getSnapshot() {
        return this.snapshot;
    }
    
    public String getTimestamp() {
        return this.timestamp;
    }
    
}
