package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarArrowRight24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarArrowRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6.022f)
            curveToRelative(-0.297f, -0.463f, -0.536f, -0.966f, -0.709f, -1.5f)
            horizontalLineTo(6f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(15f)
            verticalLineToRelative(2.813f)
            curveToRelative(0.534f, 0.173f, 1.037f, 0.412f, 1.5f, 0.709f)
            verticalLineTo(6f)
            close()
            moveTo(6f, 4.5f)
            horizontalLineToRelative(12f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-15f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            close()
            moveToRelative(17f, 13f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveTo(12f, 14.462f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            close()
            moveToRelative(-5.354f, -2.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(19.293f, 18f)
            horizontalLineTo(14.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(4.793f)
            lineToRelative(-1.647f, -1.646f)
            close()
        }
    }.build()
}
