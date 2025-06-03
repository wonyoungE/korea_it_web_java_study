package _32_Collections.strList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        // Q. TodoList
        // 1. todoList를 담을 List 생성, Scanner 생성
        // 2. 사용자에게 todo를 입력받을 건데 몇 개 입력할 건지 count변수에 입력받기
        // 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        // 4. 향상된 for문 이용, todoList 출력하기
        // 5. todoList 출력한 뒤 특정 todo 포함 여부 확인하기 위해서 searchTodo라는 변수에
        //      찾을 키워드를 입력받고 해당 searchTodo가 있는지 여부 출력하기
        // 6. 포함 여부 확인 후 삭제할 todo 입력 받아서 deleteTodo에 대입해두고 삭제 후 성공 여부 출력
        // 7. todo들 정렬하고 전체 출력
        // 8. 역순으로 정렬하고 다시 출력
        // 9. 전체 todo들의 개수 출력

        // 1. todoList를 담을 List 생성, Scanner 생성
        List<String> todoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 2. 사용자에게 todo를 입력받을 건데 몇 개 입력할 건지 count변수에 입력받기
        System.out.print("오늘 해야할 일은 몇 개 인가요? ");
        int count = sc.nextInt();
        sc.nextLine();  // 버퍼 비우기

        // 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        System.out.println("해야할 일들을 작성해주세요.");
        for(int i = 1; i <= count; i++) {
            System.out.print(i + "번 째 할 일: ");
            String todo = sc.nextLine();
            todoList.add(todo);
        }

        // 4. 향상된 for문 이용, todoList 출력하기
        for(String str : todoList) {
            System.out.println("✅" + str);
        }

        // 5. todoList 출력한 뒤 특정 todo 포함 여부 확인하기 위해서 searchTodo라는 변수에
        //     찾을 키워드를 입력받고 해당 searchTodo가 있는지 여부 출력하기
        System.out.println("찾고 싶은 todo를 입력해주세요.");
        String searchTodo = sc.nextLine();
        System.out.println(todoList.contains(searchTodo) ? "입력한 todo가 있어요!" : "입력한 todo는 존재하지 않아요.");

        // 6. 포함 여부 확인 후 삭제할 todo 입력 받아서 deleteTodo에 대입해두고 삭제 후 성공 여부 출력
        System.out.println("삭제하고 싶은 todo를 입력해주세요.");
        String deleteTodo = sc.nextLine();
        boolean isContain = todoList.contains(deleteTodo);
        if(isContain) {
            System.out.println(todoList.remove(deleteTodo) ? "해당 todo를 목록에서 삭제했어요." : "해당 todo를 삭제하지 못했어요.");
        } else {
            System.out.println("해당 todo는 목록에 존재하지 않았어요.");
        }

        // 7. todo들 정렬하고 전체 출력
        Collections.sort(todoList);
        System.out.println("todoList 정렬 -> " + todoList);

        // 8. 역순으로 정렬하고 다시 출력
        Collections.sort(todoList, Collections.reverseOrder());
        System.out.println("todoList 역정렬 -> " + todoList);

        // 9. 전체 todo들의 개수 출력
        System.out.println("해야할 일은 총 " + todoList.size() + "개 있어요.");
    }

}
