package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ServiceBell16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ServiceBell16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2.5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(0.083f)
            curveTo(8.675f, 3.528f, 8.34f, 3.5f, 8f, 3.5f)
            curveToRelative(-0.34f, 0f, -0.675f, 0.028f, -1f, 0.083f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(-2f, 1f)
            verticalLineToRelative(0.341f)
            curveTo(3.67f, 4.665f, 2f, 6.888f, 2f, 9.5f)
            curveTo(2f, 9.776f, 2.224f, 10f, 2.5f, 10f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -2.612f, -1.67f, -4.835f, -4f, -5.659f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            close()
            moveToRelative(2f, 1f)
            curveToRelative(2.593f, 0f, 4.725f, 1.973f, 4.975f, 4.5f)
            horizontalLineToRelative(-9.95f)
            curveTo(3.275f, 6.473f, 5.407f, 4.5f, 8f, 4.5f)
            close()
            moveToRelative(0f, 1f)
            curveTo(7.724f, 5.5f, 7.5f, 5.724f, 7.5f, 6f)
            reflectiveCurveTo(7.724f, 6.5f, 8f, 6.5f)
            curveToRelative(1.019f, 0f, 1.92f, 0.508f, 2.463f, 1.286f)
            curveToRelative(0.158f, 0.226f, 0.47f, 0.282f, 0.696f, 0.124f)
            curveToRelative(0.226f, -0.158f, 0.282f, -0.47f, 0.124f, -0.696f)
            curveTo(10.56f, 6.179f, 9.36f, 5.5f, 8f, 5.5f)
            close()
            moveTo(2.5f, 11f)
            curveTo(1.672f, 11f, 1f, 11.672f, 1f, 12.5f)
            reflectiveCurveTo(1.672f, 14f, 2.5f, 14f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(14.328f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(2f, 12.5f)
            curveTo(2f, 12.224f, 2.224f, 12f, 2.5f, 12f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 13f, 13.5f, 13f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 13f, 2f, 12.776f, 2f, 12.5f)
            close()
        }
    }.build()
}
