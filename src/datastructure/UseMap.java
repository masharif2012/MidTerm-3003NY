package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		// Use of HashMap
		Map<String, String> state = new HashMap<String, String>();
		state.put("NY", "New York");
		state.put("NJ", "New Jersey");
		state.put("CT", "Connecticut");

		System.out.println(state.get("NY"));

		for (Map.Entry entry:state.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}


		// Use of LinkedMapList and arraylist
		List<String> cityOfUSA = new ArrayList<>();
		cityOfUSA.add("Los Angeles");
		cityOfUSA.add("Edison");
		cityOfUSA.add("Hartford");

		ConnectToSqlDB connect = new ConnectToSqlDB();

		List listCU = cityOfUSA;
		connect.insertDataFromArrayListToSqlTable(listCU,"cityOfUSA","City");
		System.out.println("Data showing from database:");
		List<String> numberu = connect.readDataBase("cityOfUSA","City");
		for(String st:numberu){
			System.out.println(st);
		}

		List<String> cityOfCanada = new ArrayList<>();
		cityOfCanada.add("Toronto");
		cityOfCanada.add("Vancouver");
		cityOfCanada.add("Québec");

		List listCC = cityOfCanada;
		connect.insertDataFromArrayListToSqlTable(listCC,"cityOfCANDA","City");
		System.out.println("Data showing from database:");
		List<String> numberc = connect.readDataBase("cityOfCANDA","City");
		for(String st:numberc){
			System.out.println(st);
		}

		List<String> cityOfUK = new ArrayList<>();
		cityOfUK.add("London");
		cityOfUK.add("Oxford");
		cityOfUK.add("Bristol");

		List listCUK = cityOfUK;
		connect.insertDataFromArrayListToSqlTable(listCUK,"cityOfUK","City");
		System.out.println("Data showing from database:");
		List<String> numberk = connect.readDataBase("cityOfUK","City");
		for(String st:numberk){
			System.out.println(st);
		}

		Map<String, List<String>> list = new LinkedHashMap<>();
		list.put("USA", cityOfUSA);
		list.put("Canada", cityOfCanada);
		list.put("UK", cityOfUK);
		System.out.println("View from HashMap");
		for (Map.Entry entry:list.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		connect.createTableFromStringToMySql2("use_map", "mapKey", "mapValue");
		for (Object str : list.keySet()) {
			for (String str1 : list.get(str)) {
				List<String> list1 = new ArrayList<String>();
				list1.add(str.toString()); // adds key
				list1.add(str1); // adds value
				// Insert data in the database
				connect.InsertDataFromArrayListToMySql2(list1, "use_map", "mapKey", "mapValue");
			}
		}
		System.out.println("Data showing from databases");
		List<String> number = connect.readDataBase1("use_map", "mapKey", "mapValue");
		for(String st:number){
			System.out.println(st);
		}


		// Each loop to retrieve data
		System.out.println("Each loop to retrieve data");
		for (Object str : list.keySet()) {
			System.out.println("KeySet:" + str);
			for (String str1 : list.get(str)) {
				System.out.println("Value: " + str1);
			}
		}

		// using while loop with Iterator to retrieve data
		System.out.println("using while loop with Iterator to retrieve data");
		Iterator itr = list.entrySet().iterator();

		Iterator iterator = list.keySet().iterator();
		while (iterator.hasNext()) {
			Object values = iterator.next();
			for (String str1 : list.get(values)) {
				System.out.println("Value: " + str1);
			}
		}

	}

}
