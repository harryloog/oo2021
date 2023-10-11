from os import stat
import datetime
from Kirje import Kirje


def Data():
    list = []
    try:fm = open("stat.txt", "r")
    except FileNotFoundError as e:
        fm = open("stat.txt", "x") 
    else:
        statistika = fm.readlines()
        fm.close()
    
    date = datetime.date.today()
    
    for rida in statistika:
        andmed = rida.split(",")
        if datetime.date(int(andmed[2][6:10]),int(andmed[2][3:5]),int(andmed[2][0:2]))>date-datetime.timedelta(30,0,0,0,0,0,0):
            list.append(Kirje(andmed[0],andmed[1],andmed[2],andmed[3],andmed[4]))
    dict = ToOneDate(list, date)
    
    try:fm2 = open("stat.csv", "w")
    except FileNotFoundError as e:
        fm2 = open("stat.csv", "x")
        
    else:
        for i in dict:
            fm2.write(str(i)+","+str(dict[i])+"\n")
        fm2.close()
     

def ToOneDate(list, date):
    dict = {}
    for i in range(30):
        dict[date-datetime.timedelta(i+1,0,0,0,0,0,0)] = 0
    for i in range(29):
        for kirje in list:
            aeg_algus = datetime.date(int(kirje.aeg_algus[6:10]),int(kirje.aeg_algus[3:5]),int(kirje.aeg_algus[0:2]))
            aeg_lopp = datetime.date(int(kirje.aeg_lopp[6:10]),int(kirje.aeg_lopp[3:5]),int(kirje.aeg_lopp[0:2]))
            if (date-aeg_lopp == datetime.timedelta(i,0,0,0,0,0,0) and aeg_lopp-aeg_algus > datetime.timedelta(0,0,0,0,0,0,0)):
                dict[date-datetime.timedelta(i,0,0,0,0,0,0)] += int(kirje.kulu)
    return dict

Data()