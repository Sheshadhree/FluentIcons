package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ToggleMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ToggleMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 8.5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveToRelative(0f, -6.5f)
            horizontalLineToRelative(11f)
            curveTo(19.985f, 2f, 22f, 4.015f, 22f, 6.5f)
            reflectiveCurveTo(19.985f, 11f, 17.5f, 11f)
            horizontalLineToRelative(-11f)
            curveTo(4.015f, 11f, 2f, 8.985f, 2f, 6.5f)
            reflectiveCurveTo(4.015f, 2f, 6.5f, 2f)
            close()
            moveToRelative(11f, 1.5f)
            horizontalLineToRelative(-11f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(11f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(0f, 16f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveTo(2f, 17.5f)
            curveTo(2f, 15.015f, 4.015f, 13f, 6.5f, 13f)
            horizontalLineToRelative(11f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveTo(19.985f, 22f, 17.5f, 22f)
            horizontalLineToRelative(-11f)
            curveTo(4.015f, 22f, 2f, 19.985f, 2f, 17.5f)
            close()
            moveToRelative(4.5f, -3f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(11f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
