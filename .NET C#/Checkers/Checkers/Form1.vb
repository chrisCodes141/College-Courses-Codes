Public Class Form1
    Private Sub Form1_Paint(sender As Object, e As PaintEventArgs) Handles Me.Paint
        Dim ourgraphics As Graphics = e.Graphics
        Dim GrayPen As New Pen(Color.Gray, 5)
        Dim switchinPen As New SolidBrush(Color.Black)
        Dim width As Integer = 40
        Dim height As Integer = 40
        For i As Integer = 1 To 8
            For j As Integer = 0 To 7
                If switchinPen.Color = Color.Black Then
                    switchinPen.Color = Color.Red
                Else
                    switchinPen.Color = Color.Black
                End If
                ourgraphics.FillRectangle(switchinPen, j * width, height * i, width, height)
                ourgraphics.DrawRectangle(GrayPen, j * width, height * i, width, height)

            Next j
            If switchinPen.Color = Color.Black Then
                switchinPen.Color = Color.Red
            Else
                switchinPen.Color = Color.Black
            End If
        Next i
        ourgraphics.DrawArc(GrayPen, 50, 500, 50, 70, 0, 360)
        Dim myfont As New Font(FontFamily.GenericSansSerif, 48)
        switchinPen.Color = Color.Red
        ourgraphics.DrawString("HELLO", myfont, switchinPen, 100, 500)

    End Sub
End Class
