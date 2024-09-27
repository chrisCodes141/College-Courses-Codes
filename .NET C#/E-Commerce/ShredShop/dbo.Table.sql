CREATE TABLE [dbo].[MembersT](
    [MemID]         INT           IDENTITY (1, 1) NOT NULL,
    [MemUN]      NVARCHAR (30) NOT NULL,
    [MemPW]    VARCHAR (30) NOT NULL,
    [MemFN]       VARCHAR (20) NULL,
    [MemLN]      VARCHAR (20)  NULL,
    [MemEmail] VARCHAR (20),
	[LoggedIN] BIT DEFAULT 0
    CONSTRAINT [PK_Customer_T] PRIMARY KEY CLUSTERED ([MemID] ASC)
);