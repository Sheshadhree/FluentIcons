package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Directions24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Directions24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.952f, 14.299f)
            curveToRelative(-1.27f, -1.27f, -1.27f, -3.327f, 0f, -4.597f)
            lineToRelative(6.75f, -6.75f)
            curveToRelative(1.27f, -1.27f, 3.327f, -1.27f, 4.597f, 0f)
            lineToRelative(6.75f, 6.75f)
            curveToRelative(1.27f, 1.27f, 1.27f, 3.327f, 0f, 4.597f)
            lineToRelative(-6.75f, 6.75f)
            curveToRelative(-1.27f, 1.27f, -3.327f, 1.27f, -4.597f, 0f)
            lineToRelative(-6.75f, -6.75f)
            close()
            moveToRelative(10.828f, -7.08f)
            curveToRelative(-0.293f, -0.292f, -0.767f, -0.292f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.294f, -0.293f, 0.768f, 0f, 1.061f)
            lineTo(13.44f, 9f)
            horizontalLineToRelative(-1.69f)
            curveTo(10.231f, 9f, 9f, 10.231f, 9f, 11.75f)
            verticalLineToRelative(3.5f)
            curveTo(9f, 15.664f, 9.336f, 16f, 9.75f, 16f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(1.69f)
            lineToRelative(-0.72f, 0.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2f, -2f)
            close()
        }
    }.build()
}
