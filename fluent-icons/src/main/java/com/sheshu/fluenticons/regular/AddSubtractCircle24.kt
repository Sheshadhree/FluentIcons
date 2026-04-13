package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AddSubtractCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AddSubtractCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 15.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(17.664f, 16f, 17.25f, 16f)
            horizontalLineToRelative(-3.5f)
            curveTo(13.336f, 16f, 13f, 15.664f, 13f, 15.25f)
            close()
            moveToRelative(-3.5f, -8.5f)
            curveTo(9.5f, 6.336f, 9.164f, 6f, 8.75f, 6f)
            reflectiveCurveTo(8f, 6.336f, 8f, 6.75f)
            verticalLineTo(8f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
            reflectiveCurveTo(6.336f, 9.5f, 6.75f, 9.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(11.164f, 8f, 10.75f, 8f)
            horizontalLineTo(9.5f)
            verticalLineTo(6.75f)
            close()
            moveTo(12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            close()
            moveToRelative(0f, -1.5f)
            curveToRelative(4.694f, 0f, 8.5f, -3.806f, 8.5f, -8.5f)
            curveToRelative(0f, -2.077f, -0.745f, -3.98f, -1.983f, -5.457f)
            lineTo(6.543f, 18.517f)
            curveTo(8.02f, 19.755f, 9.923f, 20.5f, 12f, 20.5f)
            close()
            moveToRelative(-6.518f, -3.043f)
            lineTo(17.457f, 5.482f)
            curveTo(15.98f, 4.245f, 14.077f, 3.5f, 12f, 3.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            curveToRelative(0f, 2.077f, 0.745f, 3.98f, 1.982f, 5.457f)
            close()
        }
    }.build()
}
