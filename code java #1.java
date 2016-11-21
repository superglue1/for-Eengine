



import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        ArrayList<Human> child = new ArrayList<Human>();
        ArrayList<Human> parents = new ArrayList<Human>();
        ArrayList<Human> family = new ArrayList<Human>();
        child.add(new Human("Sam", true, 12));
        child.add(new Human("Eva", false, 10));
        child.add(new Human("David", true, 14));


        parents.add(new Human("John", true, 44, child));
        parents.add(new Human("Mia", false, 40, child));

        family.add(new Human("Bob", true, 60, parents));
        family.add(new Human("Lila", false, 57, parents));
        family.add(new Human("Pip", true, 65, parents));
        family.add(new Human("Marta", false, 60, parents));
        family.addAll(parents);
        family.addAll(child);

        for (Object item : family)
            System.out.println(item);



    }

    public static class Human
    {
       
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "name: " + this.name;
            text += ", sex: " + (this.sex ? "мужской" : "женский");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", child: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
