<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <script>
        class Person {
  constructor(name, age, sex, weight, height) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.weight = weight;
    this.height = height;
  }
}

let people = [
  new Person("Vitaliy", 25, "male", 80, 180),
  new Person("albina", 35, "female", 60, 170),
  new Person("vasia", 40, "male", 90, 175),
  new Person("alex", 30, "female", 55, 165),
  new Person("fedot", 20, "male", 75, 185),
  new Person("linda", 45, "female", 65, 160),
  new Person("david", 55, "male", 85, 170),
  new Person("xz", 28, "female", 50, 155),
  new Person("tom", 32, "male", 70, 190),
  new Person("olga", 42, "female", 75, 175),
];

let sortBy = prompt("Введите параметр для сортировки: age, sex, weight, height, name");

if (sortBy === "age") {
  people.sort((person1, person2) => {
    return person1.age - person2.age;
  });
} else if (sortBy === "sex") {
  people.sort((person1, person2) => {
    if (person1.sex < person2.sex) {
      return -1;
    } else if (person1.sex> person2.sex) {
      return 1;
    } else {
      return 0;
    }
  });
} else if (sortBy === "weight") {
  people.sort((person1, person2) => {
    return person1.weight - person2.weight;
  });
} else if (sortBy === "height") {
  people.sort((person1, person2) => {
    return person1.height - person2.height;
  });
} else if (sortBy === "name") {
  people.sort((person1, person2) => {
    if (person1.name < person2.name) {
      return -1;
    } else if (person1.name > person2.name) {
      return 1;
    } else {
      return 0;
    }
  });
} else {
  console.log("Неверный параметр для сортировки");
}

console.log(people);
    </script>
</body>
</html>
