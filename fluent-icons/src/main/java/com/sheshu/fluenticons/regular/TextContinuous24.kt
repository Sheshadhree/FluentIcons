package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextContinuous24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextContinuous24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 5f)
            curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
            reflectiveCurveTo(3.336f, 6.5f, 3.75f, 6.5f)
            horizontalLineToRelative(16.5f)
            curveTo(20.664f, 6.5f, 21f, 6.164f, 21f, 5.75f)
            reflectiveCurveTo(20.664f, 5f, 20.25f, 5f)
            horizontalLineTo(3.75f)
            close()
            moveToRelative(5f, 4f)
            curveTo(8.336f, 9f, 8f, 9.336f, 8f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(20.664f, 9f, 20.25f, 9f)
            horizontalLineTo(8.75f)
            close()
            moveTo(8f, 13.75f)
            curveTo(8f, 13.336f, 8.336f, 13f, 8.75f, 13f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 14.5f, 8f, 14.164f, 8f, 13.75f)
            close()
            moveTo(3.75f, 17f)
            curveTo(3.336f, 17f, 3f, 17.336f, 3f, 17.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(20.664f, 17f, 20.25f, 17f)
            horizontalLineTo(3.75f)
            close()
            moveToRelative(-0.53f, -5.97f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(4.19f, 12f)
            lineToRelative(-0.97f, -0.97f)
            close()
        }
    }.build()
}
