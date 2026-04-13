package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Delete24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Delete24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5f)
            horizontalLineToRelative(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            close()
            moveTo(8.5f, 5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            horizontalLineToRelative(5.75f)
            curveTo(21.664f, 5f, 22f, 5.336f, 22f, 5.75f)
            reflectiveCurveTo(21.664f, 6.5f, 21.25f, 6.5f)
            horizontalLineToRelative(-1.32f)
            lineToRelative(-1.17f, 12.111f)
            curveTo(18.573f, 20.533f, 16.957f, 22f, 15.026f, 22f)
            horizontalLineTo(8.974f)
            curveToRelative(-1.931f, 0f, -3.547f, -1.467f, -3.733f, -3.389f)
            lineTo(4.07f, 6.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
            reflectiveCurveTo(2.336f, 5f, 2.75f, 5f)
            horizontalLineTo(8.5f)
            close()
            moveToRelative(2f, 4.75f)
            curveTo(10.5f, 9.336f, 10.164f, 9f, 9.75f, 9f)
            reflectiveCurveTo(9f, 9.336f, 9f, 9.75f)
            verticalLineToRelative(7.5f)
            curveTo(9f, 17.664f, 9.336f, 18f, 9.75f, 18f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-7.5f)
            close()
            moveTo(14.25f, 9f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(15f, 17.664f, 15f, 17.25f)
            verticalLineToRelative(-7.5f)
            curveTo(15f, 9.336f, 14.664f, 9f, 14.25f, 9f)
            close()
        }
    }.build()
}
