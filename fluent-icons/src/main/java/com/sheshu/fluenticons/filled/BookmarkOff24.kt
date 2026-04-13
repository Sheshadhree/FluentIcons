package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookmarkOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookmarkOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.788f, 2.788f)
            curveToRelative(-0.004f, 0.06f, -0.005f, 0.12f, -0.005f, 0.181f)
            verticalLineToRelative(14.996f)
            curveToRelative(0f, 0.611f, 0.691f, 0.966f, 1.188f, 0.609f)
            lineTo(12f, 17.673f)
            lineToRelative(5.812f, 4.18f)
            curveTo(18.309f, 22.212f, 19f, 21.857f, 19f, 21.246f)
            verticalLineToRelative(-1.183f)
            lineToRelative(1.718f, 1.718f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(15.721f, 4.03f)
            verticalLineToRelative(9.57f)
            lineTo(6.621f, 3.437f)
            curveTo(7.1f, 3.16f, 7.657f, 3f, 8.252f, 3f)
            horizontalLineToRelative(7.498f)
            curveTo(17.545f, 3f, 19f, 4.455f, 19f, 6.25f)
            close()
        }
    }.build()
}
