package com.cedarsoftware.ncube

import groovy.transform.CompileStatic

/**
 * @author John DeRegnaucourt (jdereg@gmail.com)
 *         <br/>
 *         Copyright (c) Cedar Software LLC
 *         <br/><br/>
 *         Licensed under the Apache License, Version 2.0 (the 'License')
 *         you may not use this file except in compliance with the License.
 *         You may obtain a copy of the License at
 *         <br/><br/>
 *         http://www.apache.org/licenses/LICENSE-2.0
 *         <br/><br/>
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an 'AS IS' BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *         See the License for the specific language governing permissions and
 *         limitations under the License.
 */
@CompileStatic
class NCubeBuilder
{
    static Axis getStatesAxis()
    {
        Axis states = new Axis("State", AxisType.DISCRETE, AxisValueType.STRING, false)
        states.addColumn("AL")
        states.addColumn("AK")
        states.addColumn("AZ")
        states.addColumn("AR")
        states.addColumn("CA")
        states.addColumn("CO")
        states.addColumn("CT")
        states.addColumn("DE")
        states.addColumn("FL")
        states.addColumn("GA")
        states.addColumn("HI")
        states.addColumn("ID")
        states.addColumn("IL")
        states.addColumn("IN")
        states.addColumn("IA")
        states.addColumn("KS")
        states.addColumn("KY")
        states.addColumn("LA")
        states.addColumn("ME")
        states.addColumn("MD")
        states.addColumn("MA")
        states.addColumn("MI")
        states.addColumn("MN")
        states.addColumn("MS")
        states.addColumn("MO")
        states.addColumn("MT")
        states.addColumn("NE")
        states.addColumn("NV")
        states.addColumn("NH")
        states.addColumn("NJ")
        states.addColumn("NM")
        states.addColumn("NY")
        states.addColumn("NC")
        states.addColumn("ND")
        states.addColumn("OH")
        states.addColumn("OK")
        states.addColumn("OR")
        states.addColumn("PA")
        states.addColumn("RI")
        states.addColumn("SC")
        states.addColumn("SD")
        states.addColumn("TN")
        states.addColumn("TX")
        states.addColumn("UT")
        states.addColumn("VT")
        states.addColumn("VA")
        states.addColumn("WA")
        states.addColumn("WI")
        states.addColumn("WV")
        states.addColumn("WY")
        return states
    }

    static Axis getProvincesAxis()
    {
        Axis provinces = new Axis("Province", AxisType.DISCRETE, AxisValueType.STRING, false)
        provinces.addColumn("Quebec")
        provinces.addColumn("New Brunswick")
        provinces.addColumn("Nova Scotia")
        provinces.addColumn("Ontario")
        provinces.addColumn("Manitoba")
        provinces.addColumn("Saskatchewan")
        provinces.addColumn("Alberta")
        provinces.addColumn("British Columbia")
        provinces.addColumn("Yukon")
        provinces.addColumn("Northwest Territories")
        provinces.addColumn("Nunavut")
        provinces.addColumn("Newfoundland")
        return provinces
    }

    static Axis getContinentAxis()
    {
        Axis continent = new Axis("Continent", AxisType.DISCRETE, AxisValueType.STRING, false, Axis.DISPLAY)
        continent.addColumn("Africa")
        continent.addColumn("Antarctica")
        continent.addColumn("Asia")
        continent.addColumn("Australia")
        continent.addColumn("Europe")
        continent.addColumn("North America")
        continent.addColumn("South America")
        return continent
    }

    static Axis getDecimalRangeAxis(boolean defCol)
    {
        Axis axis = new Axis("bigD", AxisType.RANGE, AxisValueType.BIG_DECIMAL, defCol)
        axis.addColumn(new Range(-10.0, 10.0))
        axis.addColumn(new Range("20.0", "30.0"))
        axis.addColumn(new Range(100 as Byte, 1000 as Short))
        axis.addColumn(new Range(10000, 100000L))
        axis.addColumn(new Range(100000L, 9900000L))
        return axis
    }

    static Axis getDoubleRangeAxis(boolean defCol)
    {
        Axis axis = new Axis("doubleRange", AxisType.RANGE, AxisValueType.DOUBLE, defCol)
        axis.addColumn(new Range(-10.0, 10.0))
        axis.addColumn(new Range("20.0", "30.0"))
        axis.addColumn(new Range(100 as Byte, 1000 as Short))
        axis.addColumn(new Range(10000, 100000L))
        axis.addColumn(new Range(100000L, 9900000L))
        return axis
    }

    static Axis getLongRangeAxis(boolean defCol)
    {
        Axis axis = new Axis("longRange", AxisType.RANGE, AxisValueType.LONG, defCol)
        axis.addColumn(new Range(-10.0, 10.0))
        axis.addColumn(new Range("20", "30"))
        axis.addColumn(new Range(100 as Byte, 1000 as Short))
        axis.addColumn(new Range(10000, 100000L))
        axis.addColumn(new Range(100000L, 9900000L))
        return axis
    }

    static Axis getDateRangeAxis(boolean defCol)
    {
        Axis axis = new Axis("dateRange", AxisType.RANGE, AxisValueType.DATE, defCol)
        Calendar cal = Calendar.instance
        cal.set(1990, 5, 10, 13, 5, 25)
        Calendar cal1 = Calendar.instance
        cal1.set(2000, 0, 1, 0, 0, 0)
        Calendar cal2 = Calendar.instance
        cal2.set(2002, 11, 17, 0, 0, 0)
        Calendar cal3 = Calendar.instance
        cal3.set(2008, 11, 24, 0, 0, 0)
        Calendar cal4 = Calendar.instance
        cal4.set(2010, 0, 1, 12, 0, 0)
        Calendar cal5 = Calendar.instance
        cal5.set(2014, 7, 1, 12, 59, 59)

        axis.addColumn(new Range(cal, cal1.time))
        axis.addColumn(new Range(cal1, cal2.time))
        axis.addColumn(new Range(cal2, cal3))
        axis.addColumn(new Range(cal4, cal5))
        return axis
    }

    static Axis getLongDaysOfWeekAxis()
    {
        Axis axis = new Axis("Days", AxisType.DISCRETE, AxisValueType.STRING, false, Axis.DISPLAY)
        axis.addColumn("Monday")
        axis.addColumn("Tuesday")
        axis.addColumn("Wednesday")
        axis.addColumn("Thursday")
        axis.addColumn("Friday")
        axis.addColumn("Saturday")
        axis.addColumn("Sunday")
        return axis
    }

    static Axis getShortDaysOfWeekAxis()
    {
        Axis axis = new Axis("Days", AxisType.DISCRETE, AxisValueType.STRING, false, Axis.DISPLAY)
        axis.addColumn("Mon")
        axis.addColumn("Tue")
        axis.addColumn("Wed")
        axis.addColumn("Thu")
        axis.addColumn("Fri")
        axis.addColumn("Sat")
        axis.addColumn("Sun")
        return axis
    }

    static Axis getLongMonthsOfYear()
    {
        Axis axis = new Axis("Months", AxisType.DISCRETE, AxisValueType.STRING, false, Axis.DISPLAY)
        axis.addColumn("Janurary")
        axis.addColumn("February")
        axis.addColumn("March")
        axis.addColumn("April")
        axis.addColumn("May")
        axis.addColumn("June")
        axis.addColumn("July")
        axis.addColumn("August")
        axis.addColumn("September")
        axis.addColumn("October")
        axis.addColumn("November")
        axis.addColumn("December")
        return axis
    }

    static Axis getShortMonthsOfYear()
    {
        Axis axis = new Axis("Months", AxisType.DISCRETE, AxisValueType.STRING, false, Axis.DISPLAY)
        axis.addColumn("Jan")
        axis.addColumn("Feb")
        axis.addColumn("Mar")
        axis.addColumn("Apr")
        axis.addColumn("May")
        axis.addColumn("Jun")
        axis.addColumn("Jul")
        axis.addColumn("Aug")
        axis.addColumn("Sep")
        axis.addColumn("Oct")
        axis.addColumn("Nov")
        axis.addColumn("Dec")
        return axis
    }

    static Axis getGenderAxis(boolean defCol)
    {
        Axis axis = new Axis("Gender", AxisType.DISCRETE, AxisValueType.STRING, defCol)
        axis.addColumn("Male")
        axis.addColumn("Female")
        return axis
    }

    static Axis getFullGenderAxis()
    {
        Axis axis = new Axis("Gender", AxisType.DISCRETE, AxisValueType.STRING, false, Axis.DISPLAY)
        axis.addColumn("Male")
        axis.addColumn("Female")
        axis.addColumn("Trans Female->Male")
        axis.addColumn("Trans Male->Female")
        axis.addColumn("Hermaphrodite")
        return axis
    }

    static Axis getEvenAxis(boolean defCol)
    {
        Axis axis = new Axis("Even", AxisType.DISCRETE, AxisValueType.LONG, defCol)
        axis.addColumn(0L)
        axis.addColumn(2L)
        axis.addColumn(4L)
        axis.addColumn(6L)
        axis.addColumn(8L)
        axis.addColumn(10L)
        return axis
    }

    static Axis getOddAxis(boolean defCol)
    {
        Axis axis = new Axis("Odd", AxisType.DISCRETE, AxisValueType.LONG, defCol)
        axis.addColumn(1L)
        axis.addColumn(3L)
        axis.addColumn(5L)
        axis.addColumn(7L)
        axis.addColumn(9L)
        return axis
    }

    static NCube getTestNCube2D(boolean defCol)
    {
        NCube<Double> ncube = new NCube<>("test.Age-Gender")
        Axis axis1 = getGenderAxis(defCol)

        Axis axis2 = new Axis("Age", AxisType.RANGE, AxisValueType.LONG, defCol)
        axis2.addColumn(new Range(0, 18))
        axis2.addColumn(new Range(18, 30))
        axis2.addColumn(new Range(30, 40))
        axis2.addColumn(new Range(40, 65))
        axis2.addColumn(new Range(65, 80))

        ncube.addAxis(axis1)
        ncube.addAxis(axis2)

        return ncube
    }

    static NCube getTestNCube3D_Boolean()
    {
        NCube<Boolean> ncube = new NCube<>("test.ValidTrailorConfigs")
        Axis axis1 = new Axis("Trailers", AxisType.DISCRETE, AxisValueType.STRING, false, Axis.DISPLAY)
        axis1.addColumn("S1A")
        axis1.addColumn("M1A")
        axis1.addColumn("L1A")
        axis1.addColumn("S2A")
        axis1.addColumn("M2A")
        axis1.addColumn("L2A")
        axis1.addColumn("M3A")
        axis1.addColumn("L3A")
        Axis axis2 = new Axis("Vehicles", AxisType.DISCRETE, AxisValueType.STRING, false)
        axis2.addColumn("car")
        axis2.addColumn("small truck")
        axis2.addColumn("med truck")
        axis2.addColumn("large truck")
        axis2.addColumn("van")
        axis2.addColumn("motorcycle")
        axis2.addColumn("limousine")
        axis2.addColumn("tractor")
        axis2.addColumn("golf cart")
        Axis axis3 = new Axis("BU", AxisType.DISCRETE, AxisValueType.STRING, false)
        axis3.addColumn("Agri")
        axis3.addColumn("SHS")

        ncube.addAxis(axis1)
        ncube.addAxis(axis2)
        ncube.addAxis(axis3)

        return ncube
    }

    static NCube getSysClassPathCube()
    {
        return NCubeManager.getNCubeFromResource("sys.classpath.tests.json")
    }

    static NCube getRule1D()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "SimpleRule",
  "axes": [
    {
      "name": "rule",
      "type": "RULE",
      "valueType": "EXPRESSION",
      "preferredOrder": 1,
      "hasDefault": false,
      "columns": [
        {
          "id": 1000000000001,
          "type": "exp",
          "value": "true",
          "name": "init"
        },
        {
          "id": 1000000000002,
          "type":"exp",
          "value": "false",
          "name": "process"
        }
      ]
    }
  ],
  "cells": [
    {
      "id": [
        1000000000001
      ],
      "type": "string",
      "value": "1"
    },
    {
      "id": [
        1000000000002
      ],
      "type": "string",
      "value": "2"
    }
  ]
}''')
    }

    static NCube getDiscrete1DLong()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "discreteLong",
  "axes": [
    {
      "name": "code",
      "type": "DISCRETE",
      "valueType": "LONG",
      "preferredOrder": 1,
      "hasDefault": false,
      "columns": [
        {
          "id": 1000000000001,
          "value": "1"
        },
        {
          "id": 1000000000002,
          "value": "2"
        },
        {
          "id": 1000000000003,
          "value": "3"
        }
      ]
    }
  ],
  "cells": [
    {
      "id": [
        1000000000001
      ],
      "type": "string",
      "value": "a"
    },
    {
      "id": [
        1000000000002
      ],
      "type": "string",
      "value": "b"
    },
    {
      "id": [
        1000000000003
      ],
      "type": "string",
      "value": "c"
    }
  ]
}''')
    }

    static NCube getTransformMultiply()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "multiplier",
  "axes": [
    {
      "name": "method",
      "type": "DISCRETE",
      "valueType": "STRING",
      "preferredOrder": 1,
      "hasDefault": false,
      "columns": [
        {
          "id": 1000000000001,
          "value": "double"
        },
        {
          "id": 1000000000002,
          "value": "triple"
        }
      ]
    }
  ],
  "cells": [
    {
      "id": [
        1000000000001
      ],
      "type": "exp",
      "value": "        output.columns = new ArrayList()
        for (Column column : input.columns)
        {
            Column copy = new Column(column.value * 2, column.id)
            copy.setColumnName(column.getColumnName())
            output.columns.add(copy)
        }"
    },
    {
      "id": [
        1000000000002
      ],
      "type": "exp",
      "value": "output.columns = new ArrayList()\nfor (Column column : input.columns)\n{\noutput.columns.add(column.value * 2)\n}"
    }
  ]
}''')
    }

    static NCube getDiscrete1D()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "SimpleDiscrete",
  "axes": [
    {
      "name": "state",
      "type": "DISCRETE",
      "valueType": "STRING",
      "preferredOrder": 1,
      "hasDefault": false,
      "columns": [
        {
          "id": 1000000000001,
          "value": "OH"
        },
        {
          "id": 1000000000002,
          "value": "TX"
        }
      ]
    }
  ],
  "cells": [
    {
      "id": [
        1000000000001
      ],
      "type": "string",
      "value": "1"
    },
    {
      "id": [
        1000000000002
      ],
      "type": "string",
      "value": "2"
    }
  ]
}''')
    }

    static NCube getDiscrete1DAlt()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "SimpleDiscrete",
  "axes": [
    {
      "name": "state",
      "type": "DISCRETE",
      "valueType": "STRING",
      "preferredOrder": 1,
      "hasDefault": false,
      "columns": [
        {
          "id": 1000000000011,
          "value": "OH"
        },
        {
          "id": 1000000000012,
          "value": "TX"
        }
      ]
    }
  ],
  "cells": [
    {
      "id": [
        1000000000011
      ],
      "type": "string",
      "value": "1"
    },
    {
      "id": [
        1000000000012
      ],
      "type": "string",
      "value": "2"
    }
  ]
}''')
    }

    static NCube getDiscrete1DEmpty()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "SimpleDiscrete",
  "axes": [
    {
      "name": "state",
      "type": "DISCRETE",
      "valueType": "STRING",
      "preferredOrder": 1,
      "hasDefault": false,
      "columns": [
        {
          "id": 1000000000001,
          "value": "OH"
        },
        {
          "id": 1000000000002,
          "value": "TX"
        }
      ]
    }
  ],
  "cells": []
}''')
    }

    static NCube getDiscrete1DEmptyWithDefault()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "SimpleDiscrete",
  "axes": [
    {
      "name": "state",
      "type": "DISCRETE",
      "valueType": "STRING",
      "preferredOrder": 1,
      "hasDefault": true,
      "columns": [
        {
          "id": 1000000000001,
          "value": "OH"
        },
        {
          "id": 1000000000002,
          "value": "TX"
        }
      ]
    }
  ],
  "cells": []
}''')
    }

    static NCube getTestRuleCube()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "ruleDeleteTest",
  "axes": [
    {
      "name": "rule",
      "type": "RULE",
      "valueType": "EXPRESSION",
      "preferredOrder": 1,
      "hasDefault": false,
      "fireAll": true,
      "columns": [
        {
          "id": 1000000000001,
          "type": "exp",
          "name": "",
          "value": "true"
        },
        {
          "id": 1000000000002,
          "type": "exp",
          "name": "",
          "value": "true"
        },
        {
          "id": 1000000000003,
          "type": "exp",
          "name": "",
          "value": "true"
        }
      ]
    }
  ],
  "cells": [
    {
      "id": [
        1000000000001
      ],
      "type": "string",
      "value": "1"
    },
    {
      "id": [
        1000000000002
      ],
      "type": "string",
      "value": "2"
    },
    {
      "id": [
        1000000000003
      ],
      "type": "string",
      "value": "3"
    }
  ]
}''')
    }

    static NCube getRuleWithOutboundRefs()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "test.outbound.ref",
  "defaultCellValueType": "exp",
  "defaultCellValue": "@test.price[:]",
  "axes": [
    {
      "name": "rule",
      "type": "RULE",
      "valueType": "EXPRESSION",
      "preferredOrder": 1,
      "hasDefault": false,
      "fireAll": true,
      "columns": [
        {
          "id": 1000000000001,
          "type": "exp",
          "name": "availability",
          "value": "@test.available[:]"
        }
      ]
    }
  ],
  "cells": []
}''')
    }

    static NCube get5DTestCube()
    {
        return NCube.fromSimpleJson('''\
{
  "ncube": "testMerge",
  "axes": [
    {
      "name": "Age",
      "type": "RANGE",
      "valueType": "LONG",
      "preferredOrder": 0,
      "hasDefault": false,
      "fireAll": true,
      "columns": [
        {
          "id": 1000000000001,
          "value": [
            16,
            18
          ]
        },
        {
          "id": 1000000000002,
          "value": [
            18,
            22
          ]
        }
      ]
    },
    {
      "name": "Salary",
      "type": "SET",
      "valueType": "LONG",
      "preferredOrder": 0,
      "hasDefault": false,
      "fireAll": true,
      "columns": [
        {
          "id": 2000000000001,
          "value": [
            [
              60000,
              75000
            ]
          ]
        },
        {
          "id": 2000000000002,
          "value": [
            [
              75000,
              100000
            ]
          ]
        }
      ]
    },
    {
      "name": "Log",
      "type": "NEAREST",
      "valueType": "LONG",
      "preferredOrder": 0,
      "hasDefault": false,
      "fireAll": true,
      "columns": [
        {
          "id": 3000000000001,
          "type": "long",
          "value": 100
        },
        {
          "id": 3000000000002,
          "type": "long",
          "value": 1000
        }
      ]
    },
    {
      "name": "rule",
      "type": "RULE",
      "valueType": "EXPRESSION",
      "preferredOrder": 1,
      "hasDefault": false,
      "fireAll": true,
      "columns": [
        {
          "id": 4000000000001,
          "type": "exp",
          "name": "init",
          "value": "true"
        },
        {
          "id": 4000000000002,
          "type": "exp",
          "name": "process",
          "value": "true"
        }
      ]
    },
    {
      "name": "State",
      "type": "DISCRETE",
      "valueType": "STRING",
      "preferredOrder": 1,
      "hasDefault": false,
      "fireAll": true,
      "columns": [
        {
          "id": 5000000000002,
          "type": "string",
          "value": "GA"
        },
        {
          "id": 5000000000001,
          "type": "string",
          "value": "OH"
        },
        {
          "id": 5000000000003,
          "type": "string",
          "value": "TX"
        }
      ]
    }
  ],
  "cells": [
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000001,
        4000000000001,
        5000000000001
      ],
      "type": "string",
      "value": "1"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000001,
        4000000000001,
        5000000000002
      ],
      "type": "string",
      "value": "2"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000001,
        4000000000001,
        5000000000003
      ],
      "type": "string",
      "value": "3"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000001,
        4000000000002,
        5000000000001
      ],
      "type": "string",
      "value": "4"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000001,
        4000000000002,
        5000000000002
      ],
      "type": "string",
      "value": "5"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000001,
        4000000000002,
        5000000000003
      ],
      "type": "string",
      "value": "6"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000002,
        4000000000001,
        5000000000001
      ],
      "type": "string",
      "value": "7"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000002,
        4000000000001,
        5000000000002
      ],
      "type": "string",
      "value": "8"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000002,
        4000000000001,
        5000000000003
      ],
      "type": "string",
      "value": "9"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000002,
        4000000000002,
        5000000000001
      ],
      "type": "string",
      "value": "10"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000002,
        4000000000002,
        5000000000002
      ],
      "type": "string",
      "value": "11"
    },
    {
      "id": [
        1000000000001,
        2000000000001,
        3000000000002,
        4000000000002,
        5000000000003
      ],
      "type": "string",
      "value": "12"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000001,
        4000000000001,
        5000000000001
      ],
      "type": "string",
      "value": "13"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000001,
        4000000000001,
        5000000000002
      ],
      "type": "string",
      "value": "14"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000001,
        4000000000001,
        5000000000003
      ],
      "type": "string",
      "value": "15"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000001,
        4000000000002,
        5000000000001
      ],
      "type": "string",
      "value": "16"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000001,
        4000000000002,
        5000000000002
      ],
      "type": "string",
      "value": "17"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000001,
        4000000000002,
        5000000000003
      ],
      "type": "string",
      "value": "18"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000002,
        4000000000001,
        5000000000001
      ],
      "type": "string",
      "value": "19"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000002,
        4000000000001,
        5000000000002
      ],
      "type": "string",
      "value": "20"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000002,
        4000000000001,
        5000000000003
      ],
      "type": "string",
      "value": "21"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000002,
        4000000000002,
        5000000000001
      ],
      "type": "string",
      "value": "22"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000002,
        4000000000002,
        5000000000002
      ],
      "type": "string",
      "value": "23"
    },
    {
      "id": [
        1000000000001,
        2000000000002,
        3000000000002,
        4000000000002,
        5000000000003
      ],
      "type": "string",
      "value": "24"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000001,
        4000000000001,
        5000000000001
      ],
      "type": "string",
      "value": "25"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000001,
        4000000000001,
        5000000000002
      ],
      "type": "string",
      "value": "26"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000001,
        4000000000001,
        5000000000003
      ],
      "type": "string",
      "value": "27"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000001,
        4000000000002,
        5000000000001
      ],
      "type": "string",
      "value": "28"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000001,
        4000000000002,
        5000000000002
      ],
      "type": "string",
      "value": "29"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000001,
        4000000000002,
        5000000000003
      ],
      "type": "string",
      "value": "30"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000002,
        4000000000001,
        5000000000001
      ],
      "type": "string",
      "value": "31"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000002,
        4000000000001,
        5000000000002
      ],
      "type": "string",
      "value": "32"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000002,
        4000000000001,
        5000000000003
      ],
      "type": "string",
      "value": "33"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000002,
        4000000000002,
        5000000000001
      ],
      "type": "string",
      "value": "34"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000002,
        4000000000002,
        5000000000002
      ],
      "type": "string",
      "value": "35"
    },
    {
      "id": [
        1000000000002,
        2000000000001,
        3000000000002,
        4000000000002,
        5000000000003
      ],
      "type": "string",
      "value": "36"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000001,
        4000000000001,
        5000000000001
      ],
      "type": "string",
      "value": "37"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000001,
        4000000000001,
        5000000000002
      ],
      "type": "string",
      "value": "38"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000001,
        4000000000001,
        5000000000003
      ],
      "type": "string",
      "value": "39"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000001,
        4000000000002,
        5000000000001
      ],
      "type": "string",
      "value": "40"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000001,
        4000000000002,
        5000000000002
      ],
      "type": "string",
      "value": "41"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000001,
        4000000000002,
        5000000000003
      ],
      "type": "string",
      "value": "42"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000002,
        4000000000001,
        5000000000001
      ],
      "type": "string",
      "value": "43"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000002,
        4000000000001,
        5000000000002
      ],
      "type": "string",
      "value": "44"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000002,
        4000000000001,
        5000000000003
      ],
      "type": "string",
      "value": "45"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000002,
        4000000000002,
        5000000000001
      ],
      "type": "string",
      "value": "46"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000002,
        4000000000002,
        5000000000002
      ],
      "type": "string",
      "value": "47"
    },
    {
      "id": [
        1000000000002,
        2000000000002,
        3000000000002,
        4000000000002,
        5000000000003
      ],
      "type": "string",
      "value": "48"
    }
  ]
}''')

    }
}
