package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AddSubtractCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AddSubtractCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.75f, 14.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(13.336f, 16f, 13.75f, 16f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(12f, 22f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            close()
            moveToRelative(6.517f, -15.457f)
            curveTo(19.755f, 8.02f, 20.5f, 9.923f, 20.5f, 12f)
            curveToRelative(0f, 4.694f, -3.806f, 8.5f, -8.5f, 8.5f)
            curveToRelative(-2.077f, 0f, -3.98f, -0.745f, -5.457f, -1.983f)
            lineTo(18.517f, 6.543f)
            close()
            moveTo(6f, 8.75f)
            curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(6.75f)
            curveTo(8f, 6.336f, 8.336f, 6f, 8.75f, 6f)
            reflectiveCurveTo(9.5f, 6.336f, 9.5f, 6.75f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(11.164f, 9.5f, 10.75f, 9.5f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(8f, 11.164f, 8f, 10.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 9.5f, 6f, 9.164f, 6f, 8.75f)
            close()
        }
    }.build()
}
