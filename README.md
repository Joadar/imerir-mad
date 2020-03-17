### Install json-server
[JSON Server](https://github.com/typicode/json-server)

### Check your IP on wifi
`ifConfig` if you test on emulator, use this IP: `10.0.2.2`

### Create a db.json file
Create the file `db.json` in the location you want
Put this content inside:
```
{
  "books": [
    {
    	"id": 1,
    	"title": "Harry Potter",
		"price": 6.99,
		"cover": "https://assets.thalia.media/img/artikel/ba61a688bc7b3fb5ea8dc3f755cb0f39c9e0eb57-00-00.jpeg",
		"note": 4.4,
		"description": "When a letter arrives for unhappy but ordinary Harry Potter, a decade-old secret is revealed to him. His parents were wizards, killed by a Dark Lord’s curse when Harry was just a baby, and which he somehow survived. Escaping from his unbearable Muggle guardians to Hogwarts, a wizarding school brimming with ghosts and enchantments, Harry stumbles into a sinister adventure when he finds a threeheaded dog guarding a room on the third floor. Then he hears of a missing stone with astonishing powers which could be valuable, dangerous, or both."
	},
    {
    	"id": 2,
		"title": "Eragon",
		"price": 11.99,
		"cover": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Christopher_Paolini%2C_Eragon_1.jpg/375px-Christopher_Paolini%2C_Eragon_1.jpg",
		"note": 3.7,
		"description": "One boy... One dragon... A world of adventure. When Eragon finds a polished blue stone in the forest, he thinks it is the lucky discovery of a poor farm boy; perhaps it will buy his family meat for the winter. But when the stone brings a dragon hatchling, Eragon soon realizes he has stumbled upon a legacy nearly as old as the Empire itself. Overnight his simple life is shattered, and he is thrust into a perilous new world of destiny, magic, and power. With only an ancient sword and tge advice of an old storyteller for guidance, Eragon and the fledgling dragon must navigate the dangerous terrain and dark enemies of an Empire ruled by a king whose evil knows no bounds. Can Eragon take up the mantle of the legendary Dragon Riders? The fate of the Empire may rest in his hands."
	},
    {
    	"id": 3,
    	"title": "The Alchemist",
    	"price": 7.50,
    	"cover": "https://images-na.ssl-images-amazon.com/images/I/51Wqj2WAlPL._SX329_BO1,204,203,200_.jpg",
    	"note": 4.7,
    	"description": "Paulo Coelho's enchanting novel has inspired a devoted following around the world. This story, dazzling in its powerful simplicity and soul-stirring wisdom, is about an Andalusian shepherd boy named Santiago who travels from his homeland in Spain to the Egyptian desert in search of a treasure buried near the Pyramids. Along the way he meets a Gypsy woman, a man who calls himself king, and an alchemist, all of whom point Santiago in the direction of his quest. No one knows what the treasure is, or if Santiago will be able to surmount the obstacles in his path. But what starts out as a journey to find worldly goods turns into a discovery of the treasure found within. Lush, evocative, and deeply humane, the story of Santiago is an eternal testament to the transforming power of our dreams and the importance of listening to our hearts."
    },
    {
    	"id": 4,
    	"title": "Hunger Games",
    	"price": 9.99,
    	"cover": "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1447303603l/2767052.jpg",
    	"note": 2,
    	"description": "Could you survive on your own, in the wild, with everyone out to make sure you don't live to see the morning? In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts. The Capitol is harsh and cruel and keeps the districts in line by forcing them all to send one boy and one girl between the ages of twelve and eighteen to participate in the annual Hunger Games, a fight to the death on live TV. Sixteen-year-old Katniss Everdeen, who lives alone with her mother and younger sister, regards it as a death sentence when she is forced to represent her district in the Games. But Katniss has been close to dead before - and survival, for her, is second nature. Without really meaning to, she becomes a contender. But if she is to win, she will have to start making choices that weigh survival against humanity and life against love. New York Times bestselling author Suzanne Collins delivers equal parts suspense and philosophy, adventure and romance, in this searing novel set in a future with unsettling parallels to our present."
    }
  ]
}
```

### Launch the server
Go to the route of your db.json file and execute this command:
(put the IP if you use wifi, if emulator remove `--host 192.168.1.129`)

`json-server --watch --host 192.168.1.129 db.json`

### Edit endpoint
In `Constants.kt`, change the content of API_ENDPOINT:
```
// LOCAL IP = http://192.168.1.129:3000/
// 10.0.2.2 from emulator
const val API_ENDPOINT = "LOCAL_IP"
```