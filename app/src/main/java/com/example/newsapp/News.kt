package com.example.newsapp


import java.io.Serializable

class News(t: String, b: String, i: Int) : Serializable {
    var title = t
    var body = b
    var picture = i

    companion object {
        val departmentNews = arrayOf(
            News(
                "Simulation of Motor Impairment in Head-Controlled Pointer Fitts' Law Task",
                "Participants with motor impairments may not always be available for research or software development testing. To address this, we propose simulation of users with motor impairments interacting with a head-controlled mouse pointer system. Simulation can be used as a temporary stand-in for research participants, and also can serve to raise awareness about ability-based interactions to a wider software development population. We evaluated our prototype system using a Fitts' Law experiment and report on the measured communication rate of our system compared to users without motor impairments and with previously a reported participant with motor impairments.",
                R.drawable.computer
            ),
            News(
                "An Evolved Evolutionary Algorithm ",
                "Michael developed and tested and improved parameter estimation algorithm based on the principles of evolution.  Parameters are created and evaluated; the \"best\" are bred into new parameters, these newly bred parameters are mutated, and this process repeats until convergence criteria is met. These algorithms are being applied in Professor Dresch's Mathematical Biology Research.",
                R.drawable.math
            ),
            News(
                "Explore chemistry at ClarkU",
                "At the Gustaf H. Carlson School of Chemistry, faculty, grad students and undergraduates investigate together the properties of materials ranging from molecular structures and nanoparticles to DNA and high performance carbon fiber composites. The department offers a major, minor and elective courses for undergraduates, an accelerated B.A./M.S. for qualified Clark undergraduates, and a Ph.D. program.",
                R.drawable.chemistry
            )
        )
    }
}
