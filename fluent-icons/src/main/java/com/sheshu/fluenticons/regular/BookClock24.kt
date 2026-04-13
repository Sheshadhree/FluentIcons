package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 9.125f)
            verticalLineToRelative(1.625f)
            horizontalLineToRelative(0.75f)
            curveToRelative(0.345f, 0f, 0.625f, 0.28f, 0.625f, 0.625f)
            reflectiveCurveTo(14.095f, 12f, 13.75f, 12f)
            horizontalLineTo(12.5f)
            lineToRelative(-0.063f, -0.003f)
            curveTo(12.418f, 11.999f, 12.398f, 12f, 12.376f, 12f)
            curveToRelative(-0.345f, 0f, -0.625f, -0.28f, -0.625f, -0.625f)
            verticalLineToRelative(-2.25f)
            curveToRelative(0f, -0.345f, 0.28f, -0.625f, 0.625f, -0.625f)
            reflectiveCurveTo(13f, 8.78f, 13f, 9.125f)
            close()
            moveToRelative(-0.625f, -3.12f)
            curveToRelative(-2.623f, 0f, -4.75f, 2.127f, -4.75f, 4.75f)
            reflectiveCurveToRelative(2.127f, 4.75f, 4.75f, 4.75f)
            reflectiveCurveToRelative(4.75f, -2.127f, 4.75f, -4.75f)
            reflectiveCurveToRelative(-2.127f, -4.75f, -4.75f, -4.75f)
            close()
            moveToRelative(-3.5f, 4.75f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            close()
            moveTo(6.5f, 2f)
            curveTo(5.12f, 2f, 4f, 3.12f, 4f, 4.5f)
            verticalLineToRelative(15f)
            curveTo(4f, 20.88f, 5.12f, 22f, 6.5f, 22f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(6.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(14.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.12f, 19.38f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(19f, 18f)
            horizontalLineTo(5.5f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineTo(18f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}
