package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarSearch20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarSearch20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 14.5f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineToRelative(2.468f)
            curveTo(3.603f, 9.168f, 4.282f, 9f, 5f, 9f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            curveToRelative(0f, 0.695f, -0.157f, 1.353f, -0.439f, 1.94f)
            lineToRelative(1.56f, 1.56f)
            horizontalLineTo(14.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveToRelative(0f, -9f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(14f)
            verticalLineTo(5.5f)
            close()
            moveTo(7.096f, 16.303f)
            curveTo(6.512f, 16.741f, 5.786f, 17f, 5f, 17f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(3.067f, 10f, 5f, 10f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            curveToRelative(0f, 0.786f, -0.26f, 1.512f, -0.697f, 2.096f)
            lineToRelative(2.55f, 2.55f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            lineToRelative(-2.55f, -2.55f)
            close()
            moveTo(7.5f, 13.5f)
            curveTo(7.5f, 12.12f, 6.38f, 11f, 5f, 11f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveTo(3.62f, 16f, 5f, 16f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.build()
}
