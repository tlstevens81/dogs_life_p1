import React from 'react'
import HeroDetail from './HeroDetail'
const hero = {
    "id":1,
    "name":"Bruce Wayne",
    "alias":"Batman",
    "superpower":"Martial Arts",
    "teamID":1
}
const AllHeroes = () => {
  return (
    <HeroDetail info = {hero}/>
  )
}

export default AllHeroes