package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceOof12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceOof12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.281f, 4.528f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.768f, -0.293f, -1.06f, 0f)
            lineTo(3.219f, 5.47f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            lineTo(5.22f, 8.533f)
            curveToRelative(0.292f, 0.292f, 0.767f, 0.292f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.061f)
            lineTo(5.56f, 6.75f)
            horizontalLineToRelative(2.69f)
            curveTo(8.665f, 6.75f, 9f, 6.414f, 9f, 6f)
            reflectiveCurveTo(8.665f, 5.25f, 8.25f, 5.25f)
            horizontalLineTo(5.56f)
            lineToRelative(0.722f, -0.722f)
            close()
            moveTo(6f, 0f)
            curveTo(2.686f, 0f, 0f, 2.686f, 0f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
            moveTo(1.5f, 6f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(1.5f, 8.485f, 1.5f, 6f)
            close()
        }
    }.build()
}
