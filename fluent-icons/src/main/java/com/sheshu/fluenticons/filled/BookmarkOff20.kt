package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookmarkOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookmarkOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 16.707f)
            lineToRelative(1.146f, 1.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(4f, 4.707f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.188f, 0.105f, 0.36f, 0.273f, 0.446f)
            curveToRelative(0.168f, 0.085f, 0.369f, 0.069f, 0.521f, -0.042f)
            lineTo(10f, 14.118f)
            lineToRelative(5.206f, 3.786f)
            curveToRelative(0.152f, 0.111f, 0.353f, 0.127f, 0.52f, 0.042f)
            curveTo(15.895f, 17.86f, 16f, 17.688f, 16f, 17.5f)
            verticalLineToRelative(-0.793f)
            close()
            moveTo(16f, 4.5f)
            verticalLineToRelative(9.379f)
            lineTo(4.794f, 2.671f)
            curveTo(5.24f, 2.255f, 5.84f, 2f, 6.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(14.88f, 2f, 16f, 3.12f, 16f, 4.5f)
            close()
        }
    }.build()
}
