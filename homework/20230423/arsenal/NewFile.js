// let xky = 'Hello World!';

// unko = 'Hello World2!!';

//const bigXky = 'He..Hell...Hello World!!';

//let first = ['tokyo', 'yokohama', 'chiba', 'kawasaki', 'saitama'];
	
/*let index = 0;
	
	while( index < first.length ){
		
		console.log(first[index]);
		
		index++;
	}*/

/*const test = (arg) => {	
	
	if(first.length > arg){
		console.log('janpan');
		
		
		}else{
		
			console.log('kanndo');		
			
			}
	};

/*const xky2 = {
	color: 'pink',
	size: 'large',
	purfume: 'mint'	
    _scan: () => { console.log('Hello World!') ;
    }
}	;*/
const quiz = [
	{	question: 'サッカー市場、最も人気日本選手は次の内誰？',
		answers:['kamada', 'mitoma', 'tomoyasu', 'kubo',
		],
		correct: 'mitoma'
	},
	{	question: '連休中にどちらへ行くつもりだ？',
		answers:['tokyo', 'kamakura', 'yokohama', 'omiya',
		],
		correct: 'kamakura'
	},
	{	question: '日本には一番実力高さチームは誰？',
		answers:['川崎', '横浜', '広島', '埼玉',
		],
		correct: '川崎'
	},
];

const quizlength = quiz.length;
let quizindex = 0;
let socre = 0;


/*const question = 'サッカー市場、最も人気日本選手は次の内誰？';
const answers = [
		'kamada', 
		'mitoma', 
		'tomoyasu', 
		'kubo',
	];
	const correct = 'mitoma';*/
	
	const $button = document.getElementsByTagName('button');
	const buttonlength = $button.length;
	
	const setupQuiz = () => {	
		document.getElementById('js-question').textContent = quiz[quizindex].question;
		let buttonIndex = 0;
		while(buttonIndex < buttonlength){
			$button[buttonIndex].textContent = quiz[quizindex].answers[buttonIndex];
			buttonIndex++;
		}
	}
	setupQuiz();
	
	const clickhandler = (e) => {	
				if(quiz[quizindex].correct === e.target.textContent){
					window.alert('正解！');
					socre++;
					} else {
					window.alert('不正解！');					
							}
					quizindex++;
					
					if(quizindex < quizlength){
						setupQuiz();
					}else{
						window.alert('complete! correct answers is ' +socre + '/' + quizlength + '.');
					}
					};
					
		let buttonIndex = 0;
		while(buttonIndex < buttonlength){
			$button[buttonIndex].addEventListener('click', (e) => {
				clickhandler(e);
		});
		buttonIndex++;
		}
	//$button[0].textContent = answers [0];
	//$button[1].textContent = answers [1];
	//$button[2].textContent = answers [2];
	//$button[3].textContent = answers [3];
	

	/*$button[0].addEventListener('click', (e) => {
	clickhandler(e);
});

	$button[1].addEventListener('click', (e) => {
	clickhandler(e);
});
	$button[2].addEventListener('click', (e) => {
	clickhandler(e);
});
	$button[3].addEventListener('click', (e) => {
	clickhandler(e);
});*/





























	