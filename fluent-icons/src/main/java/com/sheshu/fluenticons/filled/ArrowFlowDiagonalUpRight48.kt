package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowFlowDiagonalUpRight48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowFlowDiagonalUpRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(38.75f, 24f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(12.268f)
            lineTo(20.472f, 29.296f)
            curveTo(21.432f, 30.616f, 22f, 32.242f, 22f, 34f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            curveToRelative(1.758f, 0f, 3.384f, 0.567f, 4.704f, 1.528f)
            lineTo(35.733f, 10.5f)
            horizontalLineTo(25.25f)
            curveTo(24.56f, 10.5f, 24f, 9.94f, 24f, 9.25f)
            reflectiveCurveTo(24.56f, 8f, 25.25f, 8f)
            horizontalLineToRelative(13.5f)
            curveTo(39.44f, 8f, 40f, 8.56f, 40f, 9.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            close()
        }
    }.build()
}
