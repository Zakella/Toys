package model;

public class Toy {
    private Integer id;
    private String summary;
    private Integer amount;
    private Integer frequency;


    public Toy(Integer id, String summary, Integer amount, Integer frequency) {
        this.id = id;
        this.summary = summary;
        this.amount = amount;
        this.frequency = frequency;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Summary: %s, Amount: %d, Frequency: %d",
                id, summary, amount, frequency);
    }

    }
