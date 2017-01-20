/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockDataBase;

import java.util.HashMap;
import java.util.Map;
import model.Message;

/**
 *
 * @author imady
 */
public class MockDataBase {
    private static Map<Long,Message> messages = new HashMap<>(); 

    public static Map<Long, Message> getMessages() {
        return messages;
    }
}
