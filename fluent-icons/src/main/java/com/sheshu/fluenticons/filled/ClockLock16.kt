package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ClockLock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockLock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 15f)
            curveToRelative(3.865f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.135f, -7f, -7f, -7f)
            curveTo(4.373f, 1f, 1.392f, 3.757f, 1.035f, 7.289f)
            curveTo(1.577f, 6.509f, 2.48f, 6f, 3.5f, 6f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(0.063f)
            curveTo(7.363f, 9.285f, 8f, 10.068f, 8f, 11f)
            verticalLineToRelative(4f)
            close()
            moveTo(8f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(2.5f)
            curveTo(10.775f, 8f, 11f, 8.224f, 11f, 8.5f)
            reflectiveCurveTo(10.775f, 9f, 10.5f, 9f)
            horizontalLineToRelative(-3f)
            curveTo(7.223f, 9f, 7f, 8.776f, 7f, 8.5f)
            verticalLineToRelative(-4f)
            curveTo(7f, 4.224f, 7.223f, 4f, 7.5f, 4f)
            curveTo(7.776f, 4f, 8f, 4.224f, 8f, 4.5f)
            close()
            moveTo(1.5f, 9f)
            verticalLineToRelative(1f)
            horizontalLineTo(1f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(5.5f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            close()
            moveToRelative(1f, 1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(1f, 2.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(2.75f, 13.414f, 2.75f, 13f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
