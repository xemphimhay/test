// use an integer for version numbers
version = 11


cloudstream {
    language = "vi"
    // All of these properties are optional, you can safely remove them

     description = "Xem Phim Online Chất Lượng Cao"
     authors = listOf("TM")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AsianDrama",
        "Anime",
        "TvSeries",
        "Movie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=phimnhanh2.com&sz=%size%"
}
