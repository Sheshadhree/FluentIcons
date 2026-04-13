package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle416: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle416",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(6f, -7f)
            curveTo(4.134f, 1f, 1f, 4.134f, 1f, 8f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(1f, 4.378f)
            curveTo(9f, 4.623f, 8.01f, 4.34f, 7.613f, 4.982f)
            lineTo(5.07f, 9.085f)
            curveTo(4.822f, 9.484f, 5.11f, 10f, 5.58f, 10f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            curveToRelative(0.277f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(0.5f)
            curveTo(9.776f, 10f, 10f, 9.776f, 10f, 9.5f)
            reflectiveCurveTo(9.776f, 9f, 9.5f, 9f)
            horizontalLineTo(9f)
            verticalLineTo(5.378f)
            close()
            moveTo(8f, 6.255f)
            verticalLineTo(9f)
            horizontalLineTo(6.3f)
            lineTo(8f, 6.255f)
            close()
        }
    }.build()
}
