package oopDemo;




public class Dog extends Mammal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public String eat(String food) {
        return "汪～" + super.eat(food);
    }

    @Override
    public String speak() {
        return "汪汪汪";
    }

    @Override
    public void nurse() {

    }

    /*
    Reflexivity (自反性) —  For any non-null reference value x, x.equals(x) must return true
	Symmetry (对称性) — For any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true.
	Transitivity (传递性) — For any non-null reference values x, y, and z, if x.equals(y) and y.equals(z) are true, then x.equals(z) must also be true.
	Consistency (一致性) — For any non-null reference values x and y, multiple invocations of x.equals(y) must consistently return the same result, provided no information used in the comparison has changed.
	Non-nullity (非空性) — For any non-null reference value x, x.equals(null) must return false.

    1. 自反性：x.equals(x) 为 true
	2. 对称性：x.equals(y) 与 y.equals(x) 结果相同
	3. 递移性：x==y、y==z ⇒ x==z
	4. 一致性：在物件内容未改变时，多次比较结果相同
	5. 非空：对任何非 null 的 x，x.equals(null) 必为 false
     */

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Dog other = (Dog) o;
        // field comparison
        // return this.getName().equals(other.getName());
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge();
    }

    /*
    如果兩個 object 的 .equals() 是 true, 那麼 他倆的的 hashCode 必須是一樣的數字
     */
    @Override
    public int hashCode() {
        // return this.getName().hashCode();
        return this.getName().hashCode() + this.getAge();
    }
}
