class Wilder{
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware){
	this.firstname = firstname;
	this.aware = aware;
    }

    public String getFirstName(){
	return firstname;
    }

    public void setFirstName(String name){
	this.firstname = name;
    }

    public boolean isAware(){
	return aware;
    }

    public void setAware(boolean aware){
	this.aware = aware;
    }

    public String whoAmI(){
	if (this.aware)
	    return "Je m'appelle "+ this.firstname + " et je suis aware";
	else
	    return "Je m'appelle "+ this.firstname + " et je ne suis pas aware";
    }
}
