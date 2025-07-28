interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T type;
    Meal(T t) { type = t; }
}

class Planner {
    static <T extends MealPlan> void generateMeal(Meal<T> meal) {
        System.out.println("Plan: " + meal.type.getClass().getSimpleName());
    }
}
