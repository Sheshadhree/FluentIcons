package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ToggleMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ToggleMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.5f)
            curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
            horizontalLineToRelative(11f)
            curveTo(19.985f, 2f, 22f, 4.015f, 22f, 6.5f)
            reflectiveCurveTo(19.985f, 11f, 17.5f, 11f)
            horizontalLineToRelative(-11f)
            curveTo(4.015f, 11f, 2f, 8.985f, 2f, 6.5f)
            close()
            moveToRelative(4.5f, 2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveToRelative(0f, 4.5f)
            curveTo(4.015f, 13f, 2f, 15.015f, 2f, 17.5f)
            reflectiveCurveTo(4.015f, 22f, 6.5f, 22f)
            horizontalLineToRelative(11f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(19.985f, 13f, 17.5f, 13f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(13f, 4.5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}
