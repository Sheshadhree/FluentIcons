package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoOff28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoOff28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.792f, 2.793f)
            curveTo(3.294f, 6.415f, 2f, 7.932f, 2f, 9.75f)
            verticalLineToRelative(8.5f)
            curveTo(2f, 20.321f, 3.679f, 22f, 5.75f, 22f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.818f, 0f, 3.334f, -1.294f, 3.677f, -3.012f)
            lineToRelative(6.792f, 6.793f)
            curveToRelative(0.293f, 0.292f, 0.768f, 0.292f, 1.061f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.061f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(9.183f, 6f)
            lineTo(18f, 14.817f)
            verticalLineTo(9.75f)
            curveTo(18f, 7.679f, 16.321f, 6f, 14.25f, 6f)
            horizontalLineTo(9.183f)
            close()
            moveTo(19f, 15.817f)
            lineToRelative(5.177f, 5.178f)
            curveToRelative(0.933f, 0.034f, 1.819f, -0.697f, 1.819f, -1.752f)
            verticalLineTo(8.753f)
            curveToRelative(0f, -1.41f, -1.583f, -2.242f, -2.744f, -1.44f)
            lineTo(19f, 10.249f)
            verticalLineToRelative(5.568f)
            close()
        }
    }.build()
}
