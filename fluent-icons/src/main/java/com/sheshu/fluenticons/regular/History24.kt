package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.History24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.History24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 4.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -0.376f, 0.028f, -0.746f, 0.081f, -1.108f)
            curveTo(4.648f, 10.438f, 4.316f, 10f, 3.857f, 10f)
            curveToRelative(-0.37f, 0f, -0.696f, 0.256f, -0.752f, 0.623f)
            curveTo(3.035f, 11.072f, 3f, 11.532f, 3f, 12f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
            curveTo(9.695f, 3f, 7.592f, 3.867f, 6f, 5.292f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.836f, 5.664f, 3.5f, 5.25f, 3.5f)
            reflectiveCurveTo(4.5f, 3.836f, 4.5f, 4.25f)
            verticalLineToRelative(3f)
            curveTo(4.5f, 7.664f, 4.836f, 8f, 5.25f, 8f)
            horizontalLineToRelative(3f)
            curveTo(8.664f, 8f, 9f, 7.664f, 9f, 7.25f)
            reflectiveCurveTo(8.664f, 6.5f, 8.25f, 6.5f)
            horizontalLineTo(6.9f)
            curveToRelative(1.34f, -1.241f, 3.13f, -2f, 5.1f, -2f)
            close()
            moveToRelative(0.5f, 3.25f)
            curveTo(12.5f, 7.336f, 12.164f, 7f, 11.75f, 7f)
            reflectiveCurveTo(11f, 7.336f, 11f, 7.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(12.5f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}
