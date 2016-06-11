package methods.encapsulation.modifiers_access;

/*
 
Which statement, when inserted in the code, will compile?

a) post();
b) post(language.toCharArray());
c) this();
d) this(languages.toCharArray()); 
 
*/

class Job {
	
	private String name;
	private String[] reqs;

	public Job(String name, String... reqs) {
		this.name = name;
		this.reqs = reqs;
	}

	public void post() {/* Implementation omitted */}

	private void post(char[] rawData) {	/* Implementation omitted */}
}

class Programmer extends Job {
	private String[] languages;

	public Programmer(String name, String... reqs) {
		super(name, reqs);
	}

	public void post(String language) {
		// Insert code here
	}
}
