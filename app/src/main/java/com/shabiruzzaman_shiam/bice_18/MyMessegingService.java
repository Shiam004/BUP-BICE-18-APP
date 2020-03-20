package com.shabiruzzaman_shiam.bice_18;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyMessegingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        showNotification(remoteMessage.getNotification().getTitle(),remoteMessage
        .getNotification().getBody());

    }
    public void  showNotification(String title, String message){
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this,"MyNotifications")
                .setContentTitle(title)
                .setSmallIcon(R.drawable.bup)
                .setContentText(message);
        NotificationManagerCompat manager = NotificationManagerCompat.from(this);

        manager.notify(999,builder.build());
    }
}
