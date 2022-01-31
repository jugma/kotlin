Network.callServer(Constants.url + "/get_call_one.php", dataToSend) { it->
    if (it["result"].toString() == "PASS")
    {
        Network.callServer(Constants.url + "/get_call_two.php", dataToSend) { it->
            if (it["result"].toString() == "PASS")
            {
                // do stuff
            }
        }
    }
}