classCopyConstructor{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(Person another) {
		this(another.name, another.age);
	}

}
