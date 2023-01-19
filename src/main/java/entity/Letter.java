package entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Letter {

private Long id;
private String topic;
private String letterText;
private Date shippingDate;
private Human sender;
private List<Human> receivers = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLetterText() {
        return letterText;
    }

    public void setLetterText(String letterText) {
        this.letterText = letterText;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public Human getSender() {
        return sender;
    }

    public void setSender(Human sender) {
        this.sender = sender;
    }

    public List<Human> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<Human> receivers) {
        this.receivers = receivers;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", letterText='" + letterText + '\'' +
                ", shippingDate=" + shippingDate +
                ", sender=" + sender +
                ", receivers=" + receivers +
                '}';
    }
}