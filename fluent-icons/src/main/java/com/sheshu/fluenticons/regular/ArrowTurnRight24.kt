package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.28f, 3.22f)
            curveToRelative(-0.293f, -0.293f, -0.768f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(3.22f, 3.22f)
            horizontalLineToRelative(-7.69f)
            curveToRelative(-2.347f, 0f, -4.25f, 1.903f, -4.25f, 4.25f)
            verticalLineTo(20f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(8f, 20.414f, 8f, 20f)
            verticalLineToRelative(-8.25f)
            curveTo(8f, 10.231f, 9.231f, 9f, 10.75f, 9f)
            horizontalLineToRelative(7.689f)
            lineToRelative(-3.22f, 3.22f)
            curveToRelative(-0.292f, 0.293f, -0.292f, 0.768f, 0f, 1.06f)
            curveToRelative(0.294f, 0.293f, 0.769f, 0.293f, 1.061f, 0f)
            lineToRelative(4.5f, -4.5f)
            curveTo(20.921f, 8.64f, 21f, 8.448f, 21f, 8.25f)
            curveToRelative(0f, -0.2f, -0.079f, -0.39f, -0.22f, -0.53f)
            lineToRelative(-4.5f, -4.5f)
            close()
        }
    }.build()
}
