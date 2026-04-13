package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Seat20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Seat20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(3.764f)
            curveTo(16.47f, 9.289f, 15.768f, 9f, 15f, 9f)
            curveToRelative(-1.043f, 0f, -1.963f, 0.533f, -2.5f, 1.341f)
            curveTo(11.963f, 9.533f, 11.043f, 9f, 10f, 9f)
            reflectiveCurveToRelative(-1.963f, 0.533f, -2.5f, 1.341f)
            curveTo(6.963f, 9.533f, 6.043f, 9f, 5f, 9f)
            curveTo(4.232f, 9f, 3.53f, 9.289f, 3f, 9.764f)
            verticalLineTo(6f)
            close()
            moveToRelative(9f, 6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(1f, 5f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(-6f, 0f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}
