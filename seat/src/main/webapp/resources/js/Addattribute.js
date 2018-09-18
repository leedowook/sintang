
var HallNameList = new Array;
var LineNameList = new Array;
var HallList=new Array;
var LineList;
var img_L = 0;
var img_T = 0;
var targetObj;
var Nullname=65;
var Concerthall={
		HallCount: 0 
		
};//후에 계속 추가 하는데 일단 처음엔 수가 없으므로 0으로 기본값두기

function getLeft(o){//해당 오브젝트 타켓을 가져온다
    return parseInt(o.style.left.replace('px',''));// 해당오브젝트의 탁렛의 이치를 px가뭔지는 모르겟지만 반환한다.
}
function getTop(o){//해당 오브젝트 타겟을 가져온다.
    return parseInt(o.style.top.replace('px',''));//해당 오브젝의 높이를 파악하여 int타입으로 반환한다.
}

//이미지 움직이기
function moveDrag(e){//event 함수를 가져온다.
    var e_obj = window.event? window.event : e;
    var dmvx = parseInt(e_obj.clientX + img_L);//start drag에서 정의되므로 img_L과 img_T에대한 값은 변해있다.
    var dmvy = parseInt(e_obj.clientY + img_T);//마우스 포인터 위치만큼옮기면 이미지가 움직이는거처럼 보이게된다.
    if(dmvx<0||dmvy<0){
    	dmvx=0;
    	dmvy=0;
    }else{
    targetObj.style.left = dmvx +"px";//px는 사이즈인것같다 해당 사이즈를 입력하려면 px단위로 써지므로 붙여지는듯
   //해당 오브젝트의 x좌표를 변환한다.
    targetObj.style.top = dmvy +"px";
    //해당 오브젝트의 y좌표를 변환한다.}
    return false;
}}

//드래그 시작
function startDrag(e, obj){//e=event obj=this
	console.log(obj);
    targetObj = obj;//움직일것을 정함
    var e_obj = window.event? window.event : e;//삼항연산자로 해당 타입이 window.event가 참이면 window.event로 아니면 e로  
    img_L = getLeft(obj) - e_obj.clientX;//움직일것의 왼쪽으로부터의 위치를 가져오고 후에 clientx가 마우스포인터의 x좌표 위치란다
    img_T = getTop(obj) - e_obj.clientY;//움질일것의 위로부터의 위치 후에 clienty가 마우스포인의 y좌표 위치란다
    document.onmousemove = moveDrag;//함수를 축약적으로 쓴듯 그냥 자동인식인듯 마우스가 움직일때 마다 무브 드래그를 수행해서 false값을 반환한다,.
//마우스가 움직일때 실행
    document.onmouseup = stopDrag;//함수를 실행해서반환값없는데 이걸?? 아마 그냥 비우는 용도가아닐까싶다,
//마우스에서 버튼에서 손이 때져있을때 실행
    if(e_obj.preventDefault){e_obj.preventDefault();}//해당 이벤트 오브젝트가
    
}

//드래그 멈추기
function stopDrag(){//
    document.onmousemove = null;
    document.onmouseup = null;
}//드래그가 멈췄을대 해당 값들을 비워낸다.


function AddHall_1(){
	var name=prompt("홀의 이름을 쳐주세요",placeholder="please enter Hall name");
	var HallCount=0;
	if(name!=null){
	function searching(){
	if(HallNameList.length!=0){//중복검사
		for(var names in HallNameList){
			if(name==HallNameList[names]){
				name=prompt("중복된 이름입니다 다시 홀의 이름을 쳐주세요","please enter Hall name");
				searching();
				break;
			}
		}
	}
	if(name==""||name==null){
		String.fromCharCode(Nullname);
		Nullname++;
		
	}
	}
	searching();
	AddHall_2(name);
	HallNameList.push(name);
}}



function AddHall_2(name){
	console.log(name);
	LineList==new Array;
	var Hallinfo={
			Hallname:name,
			LineList:LineList
	}
	var CreateLine="CreateLine('"+name+"')";
	var startdrag="startDrag(event,this)";
	$("#AddJob").append("<div class='"+name+"' id='Hall' name='"+name+"Hall' style='position:absolute; left:120px; top:120px; cursor:pointer; cursor:hand' onmousedown="+startdrag+"   ><p style='text-align: center;'  ><b1>"+name+"</b1></p>" +
			"<p><input type='button' value='라인 추가시키기' onclick="+CreateLine+"><input type='button' value='라인전체삭제' onclick='ClearLine("+name+")'><div id='"+name+"Linebox'></p></div> </div>");
	HallList.push(Hallinfo);
}
function ClearLine(Hallname){
	document.getElementById(Hallname+"Linebox").innerHTML="";	
}
function CreateLine(Hallname){
	var Linename=prompt("입력해라 라인의 이름을 ","0");
	function searchsamename(i,name){for(j=0;j<HallList[i].LineList.length;j++){
		if(name==HallList[i].LineList[j].LineName ){
			name=prompt("중복된 라인이름입니다.","제대로 입력하세요");
			searchsamename(i,name);
		}
	}
	return name;
	}
	var LineInfo={
			Linename:Linename
	}
	for(var i=0;i<HallList.length;i++){
		console.log("test1"+HallList[i].LineList);
		if(Hallname==HallList[i].Hallname){
			if(HallList[i].LineList!=undefined){
				Linename=searchsamename(i,Linename);
			}else{
				HallList[i].LineList.push(LineInfo);
			}
		}
	}
	
	document.getElementById(Hallname+"Linebox").innerHTML+="<p id='"+Linename+"SeatBox'></p><input type='text' name='"+Linename+"Seatcount' size='3'><input type='button' value='좌석추가' onclick='AddSeat("+Linename+")'>";
	//숫자인지 아닌지를 판단
	
	var ListInfo={
			LineName:Linename
	}
	
	
	
}
function AddSeat(name){//좌석을 추가시켜줌
	var count= document.getElementById(name+"SeatBox").Seatcount.value;
	if(!isNaN(count)){
		document.getELementById(name+"Seatcount").innerHTML="";
		document.getElementById(name+"Seatcount").innerHTML="좌석:"+count;
	}
	
}

