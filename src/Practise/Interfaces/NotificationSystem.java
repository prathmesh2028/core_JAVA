package Practise.Interfaces;

//Project Question 🚀
//Smart Notification Management System using Interfaces
//
//A company wants to develop a flexible Notification Management System for sending notifications through different platforms such as:
//
//Email
//SMS
//Push Notifications
//WhatsApp
//
//The company wants the system to be scalable so that new notification services can be added in the future without changing the existing code structure.

interface Notification
{
    void message(String msg);
}

class Email implements Notification
{
    public void message(String msg)
    {
        System.out.println("sending email :" + msg);
    }
}
class SMS implements Notification
{
    public void message(String msg)
    {
        System.out.println("Sending SMS notification :" + msg);
    }
}
class PushNotification implements Notification
{
    public void message(String msg)
    {
        System.out.println("Sending Push Notification :" + msg);
    }
}
class Whatsapp implements Notification
{
    public void message(String msg)
    {
        System.out.println("Sending whatsapp message :" + msg);
    }
}

class NotificationManager
{
    void notifyUser(Notification n , String msg)
    {
        n.message(msg);
    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        Notification Email = new Email();
        Notification SMS = new Email();
        Notification Push = new PushNotification();
        Notification wa = new Whatsapp();

        NotificationManager nm = new NotificationManager();

        nm.notifyUser(Email , "THis is an emial message");
        nm.notifyUser(wa , "Hello there this is an sample whatsapp message her e:)");
    }
}
