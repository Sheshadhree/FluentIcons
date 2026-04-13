package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarSearch16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarSearch16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(9.121f)
            lineToRelative(-1f, -1f)
            horizontalLineTo(11.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineToRelative(0.027f)
            curveToRelative(-0.347f, 0.039f, -0.682f, 0.117f, -1f, 0.23f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(10f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            close()
            moveToRelative(-8f, 11f)
            curveToRelative(0.786f, 0f, 1.512f, -0.26f, 2.096f, -0.697f)
            lineToRelative(2.55f, 2.55f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            lineToRelative(-2.55f, -2.55f)
            curveTo(6.741f, 12.012f, 7f, 11.286f, 7f, 10.5f)
            curveTo(7f, 8.567f, 5.433f, 7f, 3.5f, 7f)
            reflectiveCurveTo(0f, 8.567f, 0f, 10.5f)
            reflectiveCurveTo(1.567f, 14f, 3.5f, 14f)
            close()
            moveToRelative(0f, -1f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            reflectiveCurveTo(2.12f, 8f, 3.5f, 8f)
            reflectiveCurveTo(6f, 9.12f, 6f, 10.5f)
            reflectiveCurveTo(4.88f, 13f, 3.5f, 13f)
            close()
        }
    }.build()
}
