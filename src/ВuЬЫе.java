public class ВuЬЫе {
    public static void main(String args[]) {
        int nums[] = (99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49)}

    ;
    int а, Ь, t;
    int size;
    size =10;                          // количество сортируемь элементов
    // Отобразить исходны массив
System.out.print("Иcxoдный массив:");
for(
    int i = 0;
    i<size;i++)
            System.out.print(" "+nums[i]);
System.out.println()
        // Реализовать алгоритм пузырьковой сортировки
        for(a=1;а<size;а++)
            for (b=size-1; Ь >=а; Ь-- )

    {
        if (nums[b - 1] > nums[b]) {       // если требуемый порядок
            t = nums[b - 1];
            nums[b - 1] = nums[b];
            nums[b] = t;
            // следования не соблюдается,
            // поменять элементы местам
        }
    }
}