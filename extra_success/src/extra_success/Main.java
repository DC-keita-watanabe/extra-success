package extra_success;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] names = { 
		        "なかやまきんに君", "木梨憲武", "内村光良", "伊達きみお", "有田哲平", "上田晋也", "ノブ", 
		        "春日俊彰", "やす子", "若林正恭", "りんたろー", "濱家隆一", "日村勇紀", "陣内智則", "タモリ", 
		        "田中健一", "渡辺直美", "伊藤純一", "小林桜", "加藤初美", "中村悠一", "吉田沙保里", "木村拓哉", 
		        "斎藤工", "新垣結衣", "石原さとみ", "福山雅治", "井上真央", "二宮和也", "深田恭子",
		        "大野智", "櫻井翔", "相葉雅紀", "松田翔太", "中村倫也", "吉岡里帆", "広瀬すず", "有村架純", 
		        "小島よしお", "ヒロシ", "ムーディ勝山", "はなわ", "狩野英考","山田太郎", "佐藤花子", "鈴木一郎", 
		        "堤真一", "北川景子", "松本潤", "高橋美咲",
		    };
		
		AccountCreator accountCreator  = new AccountCreator(names[0]);
		System.out.println(accountCreator.getUser().toString());
	}

}