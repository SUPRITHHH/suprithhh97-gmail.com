let h1Element = document.getElementById('demo')
console.log('Element = ',h1Element)
console.log('Element Text = ',h1Element.textContent)
h1Element.textContent = "GOOD EVENING";
let buttonElement=document.createElement('button')
console.log("Button Element",buttonElement)
buttonElement.textContent = "CLICK ME";
console.log("Button Element",buttonElement)
document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent="SQL"
li2Element.textContent="JAVA"
li3Element.textContent="HTML"

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)


h1Element.style.color = 'red'
h1Element.style.fontSize = '10px'



