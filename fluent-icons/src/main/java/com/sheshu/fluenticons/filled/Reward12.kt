package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Reward12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Reward12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.25f, 1f)
            curveTo(1.56f, 1f, 1f, 1.56f, 1f, 2.25f)
            verticalLineToRelative(1.162f)
            curveToRelative(0f, 0.544f, 0.295f, 1.046f, 0.772f, 1.31f)
            lineToRelative(2.876f, 1.599f)
            curveTo(3.67f, 6.815f, 3f, 7.829f, 3f, 9f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            curveToRelative(0f, -1.17f, -0.67f, -2.185f, -1.648f, -2.679f)
            lineToRelative(2.877f, -1.598f)
            curveTo(10.704f, 4.458f, 11f, 3.956f, 11f, 3.412f)
            verticalLineTo(2.25f)
            curveTo(11f, 1.56f, 10.44f, 1f, 9.75f, 1f)
            horizontalLineToRelative(-7.5f)
            close()
            moveTo(5f, 5.372f)
            verticalLineTo(2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.372f)
            lineTo(6f, 5.928f)
            lineTo(5f, 5.372f)
            close()
            moveTo(8f, 9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}
