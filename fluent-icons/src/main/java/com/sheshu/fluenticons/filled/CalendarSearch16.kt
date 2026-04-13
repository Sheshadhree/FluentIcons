package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarSearch16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarSearch16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 11.5f)
            verticalLineTo(6f)
            horizontalLineTo(3.5f)
            curveTo(5.985f, 6f, 8f, 8.015f, 8f, 10.5f)
            curveToRelative(0f, 0.695f, -0.157f, 1.353f, -0.439f, 1.94f)
            lineTo(9.121f, 14f)
            horizontalLineTo(11.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveToRelative(0f, -7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(12f)
            verticalLineTo(4.5f)
            close()
            moveTo(3.5f, 14f)
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
