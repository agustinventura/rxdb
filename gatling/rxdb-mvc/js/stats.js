var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "500",
        "ok": "500",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "611",
        "ok": "611",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1131",
        "ok": "1131",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "706",
        "ok": "706",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "62",
        "ok": "62",
        "ko": "-"
    },
    "percentiles1": {
        "total": "691",
        "ok": "691",
        "ko": "-"
    },
    "percentiles2": {
        "total": "726",
        "ok": "726",
        "ko": "-"
    },
    "percentiles3": {
        "total": "824",
        "ok": "824",
        "ko": "-"
    },
    "percentiles4": {
        "total": "928",
        "ok": "928",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 463,
        "percentage": 93
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 37,
        "percentage": 7
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "1.412",
        "ok": "1.412",
        "ko": "-"
    }
},
contents: {
"req_enclosures-page-fb6eb": {
        type: "REQUEST",
        name: "Enclosures Page WarmUp Request",
path: "Enclosures Page WarmUp Request",
pathFormatted: "req_enclosures-page-fb6eb",
stats: {
    "name": "Enclosures Page WarmUp Request",
    "numberOfRequests": {
        "total": "500",
        "ok": "500",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "611",
        "ok": "611",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1131",
        "ok": "1131",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "706",
        "ok": "706",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "62",
        "ok": "62",
        "ko": "-"
    },
    "percentiles1": {
        "total": "691",
        "ok": "691",
        "ko": "-"
    },
    "percentiles2": {
        "total": "726",
        "ok": "726",
        "ko": "-"
    },
    "percentiles3": {
        "total": "824",
        "ok": "824",
        "ko": "-"
    },
    "percentiles4": {
        "total": "928",
        "ok": "928",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 463,
        "percentage": 93
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 37,
        "percentage": 7
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "1.412",
        "ok": "1.412",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
