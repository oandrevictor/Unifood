module unifood

--Signatures--

some sig University {
	campus: some Campus
}

sig Campus {
	restaurants: some Restaurant
}

sig User {
	type: one Type,
	uCampus: one Campus
}

abstract sig Type {}

sig Student extends Type {
	favProducts: some Product,
	favRestaurant: some Restaurant
}

sig Owner extends Type {
	restaurant: one Restaurant
}

sig Restaurant {
	products: some Product,
	reviews: some Review
}

sig Product {}

sig Review {
	dev: one Student
}


--Facts--

fact {
	all u:University | some u.campus
	all c:Campus | some c.~campus

	all u:User | one u.type
	all t:Type | some t.~type

	all u:User | one u.uCampus
	all c:Campus | some c.~uCampus

	all p:Product | some p.~products
	all r:Review | some r.~reviews

	all o:Owner | one o.restaurant
	all r:Restaurant | some r.~restaurant

	all r:Restaurant | some r.~restaurants

	all r:Restaurant, c1:Campus, c2:Campus | (r in c1.restaurants) and (r in c2.restaurants) => c1 = c2

	all r:Review, r1:Restaurant, r2:Restaurant | (r in r1.reviews) and (r in r2.reviews) => r1 = r2

	all p:Product, r1:Restaurant, r2:Restaurant | (p in r1.products) and (p in r2.products) => r1 = r2

	all t:Type, u1:User, u2:User | (t in u1.type) and (t in u2.type) => u1 = u2

	all r:Restaurant, o1:Owner, o2:Owner | (r in o1.restaurant) and (r in o2.restaurant) => o1 = o2
}


--Predicates--

pred show[]{
}

run show for 10
