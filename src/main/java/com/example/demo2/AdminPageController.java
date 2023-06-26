/*Lesson3_Chapter21_SpringBoot  認証・認可

・認証（Authentication）：通信相手が誰であるかを確認すること。
・認可（Authorization）：画面にアクセスする権限や処理を行う権限など、特定の条件に対してアクセスの権限を与えること。

*/

//③-3リクエストを受け付けるコントローラを作成する

package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {
	
	@GetMapping("/adminPage")
	public String adminPage() {
		return "adminPage";
	}
	
}
