package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.75f, 11.375f)
            curveToRelative(0f, 0.345f, 0.28f, 0.625f, 0.625f, 0.625f)
            lineToRelative(0.063f, -0.003f)
            curveTo(12.457f, 11.999f, 12.477f, 12f, 12.5f, 12f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.345f, 0f, 0.625f, -0.28f, 0.625f, -0.625f)
            reflectiveCurveToRelative(-0.28f, -0.625f, -0.625f, -0.625f)
            horizontalLineTo(13f)
            verticalLineTo(9.125f)
            curveTo(13f, 8.78f, 12.72f, 8.5f, 12.375f, 8.5f)
            reflectiveCurveTo(11.75f, 8.78f, 11.75f, 9.125f)
            verticalLineToRelative(2.25f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(14.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(5.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 22f, 4f, 20.88f, 4f, 19.5f)
            verticalLineToRelative(-15f)
            close()
            moveToRelative(8.375f, 1.505f)
            curveToRelative(-2.623f, 0f, -4.75f, 2.127f, -4.75f, 4.75f)
            reflectiveCurveToRelative(2.127f, 4.75f, 4.75f, 4.75f)
            reflectiveCurveToRelative(4.75f, -2.127f, 4.75f, -4.75f)
            reflectiveCurveToRelative(-2.127f, -4.75f, -4.75f, -4.75f)
            close()
        }
    }.build()
}
