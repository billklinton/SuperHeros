package com.example.superheros.models

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


data class Hero(val response:String, @SerializedName("results-for")val results_for: String, val results:MutableList<Result>)


data class Result(val id:String, val name: String, val powerstats:Powerstats, val biography:Biography, val appearance: Appearance, val work: Work, val connections: Connections, val image:Image)


data class Powerstats(val intelligence: String, val strength: String, val speed:String, val durability:String, val power: String, val combat:String )


data class Biography(@SerializedName("full-name")val full_name: String, @SerializedName("alter-egos")val alter_egos: String, val aliases:List<String>, @SerializedName("place-of-birth") val place_of_birth:String, @SerializedName("first-appearance")val first_appearance: String, val publisher:String, val alignment:String )


data class Appearance(val gender: String, val race: String, val height:List<String>,val weight:List<String>, @SerializedName("eye-color") val eye_color:String, @SerializedName("hair-color") val hair_color: String)


data class Work(val occupation: String, val base: String)


data class Connections(@SerializedName("group-affiliation") val group_affiliation: String, val relatives: String)


data class Image(val url:String)