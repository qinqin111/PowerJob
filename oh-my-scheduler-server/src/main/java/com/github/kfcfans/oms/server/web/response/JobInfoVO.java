package com.github.kfcfans.oms.server.web.response;

import lombok.Data;

import java.util.Date;

/**
 * JobInfo 对外展示对象
 *
 * @author tjq
 * @since 2020/4/12
 */
@Data
public class JobInfoVO {

    private Long id;

    /* ************************** 任务基本信息 ************************** */
    // 任务名称
    private String jobName;
    // 任务描述
    private String jobDescription;
    // 任务所属的应用ID
    private Long appId;
    // 任务自带的参数
    private String jobParams;
    // 任务实例的参数(API触发专用)
    private String instanceParams;

    /* ************************** 定时参数 ************************** */
    // 时间表达式类型（CRON/API/FIX_RATE/FIX_DELAY）
    private Integer timeExpressionType;
    // 时间表达式，CRON/NULL/LONG/LONG
    private String timeExpression;

    /* ************************** 执行方式 ************************** */
    // 执行类型，单机/广播/MR
    private Integer executeType;
    // 执行器类型，Java/Shell
    private Integer processorType;
    // 执行器信息
    private String processorInfo;

    /* ************************** 运行时配置 ************************** */
    // 最大同时运行任务数，默认 1
    private Integer maxInstanceNum;
    // 并发度，同时执行某个任务的最大线程数量
    private Integer concurrency;
    // 任务整体超时时间
    private Long instanceTimeLimit;

    /* ************************** 重试配置 ************************** */
    private Integer instanceRetryNum;
    private Integer taskRetryNum;

    // 1 正常运行，2 停止（不再调度）
    private Integer status;
    // 下一次调度时间
    private Long nextTriggerTime;

    /* ************************** 繁忙机器配置 ************************** */
    // 最低CPU核心数量，0代表不限
    private double minCpuCores;
    // 最低内存空间，单位 GB，0代表不限
    private double minMemorySpace;
    // 最低磁盘空间，单位 GB，0代表不限
    private double minDiskSpace;

    private Date gmtCreate;
    private Date gmtModified;
}
