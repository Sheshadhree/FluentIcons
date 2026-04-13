package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookmarkOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookmarkOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.707f)
            lineTo(2.147f, 2.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineToRelative(15f, 15f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(16f, 16.707f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.188f, -0.106f, 0.36f, -0.273f, 0.446f)
            curveToRelative(-0.168f, 0.085f, -0.37f, 0.069f, -0.521f, -0.042f)
            lineTo(10f, 14.118f)
            lineToRelative(-5.206f, 3.786f)
            curveToRelative(-0.152f, 0.111f, -0.353f, 0.127f, -0.521f, 0.042f)
            curveTo(4.105f, 17.86f, 4f, 17.688f, 4f, 17.5f)
            verticalLineTo(4.707f)
            close()
            moveToRelative(11f, 11f)
            lineToRelative(-10f, -10f)
            verticalLineToRelative(10.811f)
            lineToRelative(4.706f, -3.422f)
            curveToRelative(0.175f, -0.128f, 0.413f, -0.128f, 0.588f, 0f)
            lineTo(15f, 16.518f)
            verticalLineToRelative(-0.811f)
            close()
            moveTo(15f, 4.5f)
            verticalLineToRelative(8.379f)
            lineToRelative(1f, 1f)
            verticalLineTo(4.5f)
            curveTo(16f, 3.12f, 14.88f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(5.84f, 2f, 5.24f, 2.255f, 4.794f, 2.672f)
            lineTo(5.502f, 3.38f)
            curveTo(5.767f, 3.144f, 6.117f, 3f, 6.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(14.328f, 3f, 15f, 3.672f, 15f, 4.5f)
            close()
        }
    }.build()
}
