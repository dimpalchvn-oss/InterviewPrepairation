//package com.example.codesamplesapplication
//
//import org.jetbrains.annotations.TestOnly
//
//override fun getGuidanceStateFlow() = guidanceClient.getGuidanceStateStream().map {
//    when(it.value) {
//        Guidanceservice.Status.STATUS_ACTIVE -> GuidanceState.ON_GUIDANCE_START
//        Guidanceservice.Status.STATUS_INACTIVE -> GuidanceState.ON_GUIDANCE_STOP
//        Guidanceservice.Status.UNRECOGNIZED -> GuidanceState.ON_GUIDANCE_UNKNOWN
//        else -> GuidanceState.ON_GUIDANCE_UNKNOWN
//    }
//}
//
//
//class TestCode{
//
//    @Test
//    fun getGuildanceStateFLow_
//
//}
//
//
//
//
//
//class MySingletonDB{
//    companion object {
//        @Volatile
//        private lateinit var  MySingletonDB : RoomDB
//
//        fun getInstance(): MySingletonDB {
//            if(MySingletonDB == null){
//                synchronized(this) {
//                    if(MySingletonDB == null){
//
//                    }
//                }
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
