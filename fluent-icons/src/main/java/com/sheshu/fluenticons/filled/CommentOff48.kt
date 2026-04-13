package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentOff48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentOff48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(34.232f, 36f)
            lineToRelative(7.634f, 7.634f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-37.5f, -37.5f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(1.875f, 1.875f)
            curveTo(4.86f, 9.329f, 4f, 11.189f, 4f, 13.25f)
            verticalLineToRelative(15.5f)
            curveTo(4f, 32.754f, 7.246f, 36f, 11.25f, 36f)
            horizontalLineTo(12f)
            verticalLineToRelative(5.82f)
            curveToRelative(0f, 1.824f, 2.057f, 2.89f, 3.547f, 1.838f)
            lineTo(26.398f, 36f)
            horizontalLineToRelative(7.835f)
            close()
            moveTo(11.303f, 6f)
            lineTo(40.35f, 35.045f)
            curveToRelative(2.18f, -1.25f, 3.65f, -3.6f, 3.65f, -6.295f)
            verticalLineToRelative(-15.5f)
            curveTo(44f, 9.246f, 40.754f, 6f, 36.75f, 6f)
            horizontalLineTo(11.303f)
            close()
        }
    }.build()
}
