package com.example.wordle

object FourLetterWordList {
    private val fourLetterWords = listOf(
        "AREA","ARMY","BABY","BALL","BAND","BANK","BASE","BILL","BODY","BOOK","CALL",
        "CARD","CARE","CASE","CASH","CITY","CLUB","COST","DATE","DEAL","DOOR","DUTY",
        "EAST","EDGE","FACE","FACT","FARM","FEAR","FILE","FILM","FIRE","FIRM","FISH",
        "FOOD","FOOT","FORM","FUND","GAME","GIRL","GOAL","HAIR","HALF","HALL","HAND",
        "HEAD","HELP","HILL","HOME","HOPE","HOUR","IDEA","JACK","JOHN","KING","LACK",
        "LADY","LAND","LIFE","LINE","LIST","LOOK","LORD","LOSS","LOVE","MARK","MARY",
        "MIND","MISS","MOVE","NAME","NEED","NEWS","NOTE","PAGE","PAIN","PAIR","PARK",
        "PART","PAST","PATH","PAUL","PLAN","PLAY","POST","RACE","RAIN","RATE","REST",
        "RISE","RISK","ROAD","ROCK","ROLE","ROOM","RULE","SALE","SEAT","SHOP","SHOW",
        "SIDE","SIGN","SITE","SIZE","SKIN","SORT","STAR","STEP","TASK","TEAM","TERM",
        "TEST","TEXT","TIME","TOUR","TOWN","TREE","TURN","TYPE","UNIT","USER","VIEW",
        "WALL","WEEK","WEST","WIFE","WILL","WIND","WINE","WOOD","WORD","WORK","YEAR",
        "BEAR","BEAT","BLOW","BURN","CAST","COME","COOK","COPE","DARK","DARE","DEAL",
        "DENY","DRAW","DROP","EARN","FAIL","FALL","FEEL","FIND","GAIN","GIVE","GROW",
        "HANG","HATE","HAVE","HEAR","HIDE","HOLD","HURT","JOIN","JUMP","KEEP","KILL",
        "KNOW","LAST","LEAD","LEND","LIFT","LIKE","LINK","LOSE","MAKE","MEET","MUST",
        "OPEN","PASS","PICK","PRAY","PULL","PUSH","READ","RELY","RIDE","RING","ROLL",
        "SAVE","SEEK","SEEM","SELL","SEND","SHED","SING","SLIP","STAY","STOP","SUIT",
        "TAKE","TALK","TELL","TEND","TURN","VARY","VOTE","WAIT","WAKE","WALK","WANT",
        "WARN","WASH","WEAR","WISH","ABLE","BACK","BARE","BASS","BLUE","BOLD","BUSY",
        "CALM","COLD","COOL","DAMP","DEAD","DEAF","DEAR","DEEP","DUAL","DULL","DUMB",
        "EASY","EVIL","FAIR","FAST","FINE","FIRM","FLAT","FOND","FOUL","FREE","FULL",
        "GLAD","GOOD","GREY","GRIM","HARD","HIGH","HOLY","HUGE","JUST","KEEN","KIND",
        "LATE","LAZY","LIVE","LONE","LONG","LOUD","MAIN","MALE","MASS","MEAN","MERE")

    fun getRandomFourLetterWord(): String {
        return fourLetterWords.random()
    }
}
