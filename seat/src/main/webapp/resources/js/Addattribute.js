var HallNameList = new Array;

function AddHall_1(){
	var name=prompt("홀의 이름을 쳐주세요","please enter Hall name");
	var HallCount=0;
	function searching(){
		console.log(HallNameList.length);
	if(HallNameList.length!=0){//중복검사
		for(var names in HallNameList){
			if(name==HallNameList[names]){
				name=prompt("중복된 이름입니다 다시 홀의 이름을 쳐주세요","please enter Hall name");
				searching();
				break;
			}else{
				
			}
		}
	}
	
	}
	searching();
	AddHall_2(name);
	HallNameList.push(name);
}
function AddLine(){
	var name=prompt("홀의 이름을 쳐주세요","please enter Hall name");
	
	
}
function AddHall_2(name){
	console.log(name);
	$("#AddJob").append("<label for='"+name+"Hall'>"+name+"</label><div class='"+name+"' id='Hall' ><a href='#' onclick='AddLine()'>라인추가</a></div>");
	

}

function Saver(){
	/*들어가야할 내용  
	콘서트장 이름 
	홀의 이름과 홀의  위치값  
	
	
	
	*/
	
}
