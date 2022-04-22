import fetchFollowers from './fetchFollowers.js'
import displayFollowers from './displayFollowers.js'
import paginate from './paginate.js'
import displayButtons from './displayButtons.js'

const title = document.querySelector('.section-title h1')
const btnContainer = document.querySelector('.btn-container')
const btnKacliSayfa=document.querySelector("#sec");

let index = 0
let pages = []
let followers;

const setupUI = () => {
  displayFollowers(pages[index])
  displayButtons(btnContainer, pages, index)
}

const init = async () => {
  followers = await fetchFollowers()
  title.textContent = 'Sayfalar'

  const sayfa=Number(btnKacliSayfa.value);
  pages = paginate(followers,sayfa);
  setupUI()
}

btnKacliSayfa.addEventListener("change", (e) => {
 pages = paginate(followers,e.target.value);
 setupUI()
});



btnContainer.addEventListener('click', function (e) {
  if (e.target.classList.contains('btn-container')) return
  if (e.target.classList.contains('page-btn')) {
    index = parseInt(e.target.dataset.index)
  }

  if (e.target.classList.contains('next-btn')) {
    index++

    if (index == pages.length) {
      index = 0
    }
  }
  if (e.target.classList.contains('prev-btn')) {
    index--
    if (index < 0) {
      index = pages.length - 1
    }
  }
  setupUI()
})
window.addEventListener('load', init)
